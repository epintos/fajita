package ar.uba.dc.rfm.fajita.translation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import recoder.CrossReferenceServiceConfiguration;
import recoder.java.CompilationUnit;
import recoder.kit.ProblemReport;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.tools.FileSystemTools;

public class PathTransformation extends FajitaSourceTransformation {
    
    private CrossReferenceServiceConfiguration recoder;
    
    public PathTransformation(FajitaConfiguration configuration, CrossReferenceServiceConfiguration recoder,
            CompilationUnit compilationUnit) {
        super(configuration, recoder, compilationUnit);
        this.recoder = recoder;
    }

    @Override
    public ProblemReport execute() {
        configuration.setDiscoveredPaths(0);
        loopUnrollCode();
        decorateWithBranchTransformation();
        return null;
    }
    
    private void decorateWithBranchTransformation() {
//        replaceNewClassToCheck();
        new BranchTransformation(configuration, recoder, compilationUnit).execute();
    }

    private void replaceNewClassToCheck() {
        String newClassToCheck = configuration.getClassToCheck() + "Unrolled";
        String newRelevantClasses = buildRelevantClasses();
        configuration.setClassToCheck(newClassToCheck);
        configuration.setRelevantClasses(newRelevantClasses);
    }

    private void loopUnrollCode() {
        LoopUnrollTransformation.transform(compilationUnit);
//        String separator = FileSystemTools.separator;
//        List<String> classes = extractClassesToCheck(configuration.getRelevantClasses(), configuration.getClassToCheck());
//        for(String clazz : classes) {
//            String sourcePath = configuration.getClasspath() + separator + clazz.replace(".", separator) + ".java";
//            String destPath = configuration.getClasspath() + separator + clazz.replace(".", separator) + ".java";
//            try {
//                LoopUnrollTransformation.javaUnroll(3, sourcePath, destPath);
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
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
    
    private List<String> extractClassesToCheck(String relevantClasses, String classToCheck) {
        String[] array = classToCheck.split("\\.");
        String toCheck = array[array.length - 1];
        List<String> ret = new ArrayList<>();
        for(String clazz: relevantClasses.split(",")) {
            if (clazz.contains(toCheck)) {
                ret.add(clazz);
            }
        }
        return ret;
    }

}
