package ar.uba.dc.rfm.fajita.translation;

import recoder.java.Import;
import recoder.java.SourceVisitor;
import recoder.java.reference.PackageReference;



public class ImportAddInstrumentedVisitor extends SourceVisitor {
	
	
	public ImportAddInstrumentedVisitor(){
		super();
	}
	
	@Override
	public void visitImport(Import i){
		PackageReference pr = i.getPackageReference();
	}
	
}
