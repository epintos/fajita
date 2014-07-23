package ar.uba.dc.rfm.fajita.translation;

import java.io.IOException;
import java.util.List;

import recoder.CrossReferenceServiceConfiguration;
import recoder.java.CompilationUnit;
import recoder.kit.ProblemReport;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.tools.FileSystemTools;

public class PathTransformation extends FajitaSourceTransformation {
    
    private BranchTransformation bt;
    
    public PathTransformation(FajitaConfiguration configuration, CrossReferenceServiceConfiguration recoder,
            CompilationUnit compilationUnit) {
        super(configuration, recoder, compilationUnit);
        bt = new BranchTransformation(configuration, recoder, compilationUnit);
    }

    @Override
    public ProblemReport execute() {
        loopUnrollCode();
        decorateWithBranchTransformation();
        return null;
    }
    
    private void decorateWithBranchTransformation() {
        replaceNewClassToCheck();
        bt.execute();
    }

    private void replaceNewClassToCheck() {
        String newClassToCheck = configuration.getClassToCheck() + "Unrolled";
        String newRelevantClasses = buildRelevantClasses();
        configuration.setClassToCheck(newClassToCheck);
        configuration.setRelevantClasses(newRelevantClasses);
    }

    private void loopUnrollCode() {
        String separator = FileSystemTools.separator;
        String clazz = extractClassToCheck(configuration.getRelevantClasses(), configuration.getClassToCheck());
        String sourcePath = configuration.getClasspath() + separator + clazz.replace(".", separator) + ".java";
        String destPath = configuration.getClasspath() + separator + clazz.replace(".", separator) + "Unrolled.java";
        try {
            LoopUnrollTransformation.javaUnroll(3, sourcePath, destPath);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private String buildRelevantClasses() {
        String[] array = configuration.getRelevantClasses().split(",");
        String result = "";
        String[] toCheckArray = configuration.getClassToCheck().split("\\.");
        String toCheck = toCheckArray[toCheckArray.length - 1];
        for(String clazz: array) {
            if (result != "") {
                result += ",";
            }
            if (clazz.contains(toCheck)) {
                result += clazz + "Unrolled";
            } else {
                result += clazz;
            }
        }
        return result;
    }
    
    private String extractClassToCheck(String relevantClasses, String classToCheck) {
        String[] array = classToCheck.split("\\.");
        String toCheck = array[array.length - 1];
        for(String clazz: relevantClasses.split(",")) {
            if (clazz.contains(toCheck)) {
                return clazz;
            }
        }
        return "";
    }

}
