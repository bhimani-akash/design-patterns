package edu.neu.csye7374;

import java.util.List;

public class FileFacade implements FileFacadeAPI {

	InterfaceReadWrite readwriteFile;
	List<String> programData;
	
	public FileFacade(InterfaceReadWrite readwriteFile) {
		this.readwriteFile = readwriteFile;
	}
	
	@Override
	public void save(List<String> programData) {
		// TODO Auto-generated method stub
		System.out.println("-----Save function called-----");
		readwriteFile.createFile();
		readwriteFile.openFile();
		readwriteFile.writeFile();
		readwriteFile.closeFile();
		this.programData = programData;
	}

	@Override
	public List<String> programDataload() {
		// TODO Auto-generated method stub
		System.out.println("-----Program Data load function called-----");
		readwriteFile.openFile();
		readwriteFile.readFile();
		readwriteFile.closeFile();
		
		for(String s : programData) 
			System.out.println(s);
		
		return programData;
	}

}
