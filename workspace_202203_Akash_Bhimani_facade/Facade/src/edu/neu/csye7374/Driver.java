package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		InterfaceReadWrite readwriteText = new ReadWriteFile();
		FileFacadeAPI textFacade = new FileFacade(readwriteText);
		
		InterfaceReadWrite readwriteJSON = new ReadWriteJSON();
		FileFacadeAPI textJSON = new FileFacade(readwriteJSON);
		
		InterfaceReadWrite readwriteXML = new ReadWriteXML();
		FileFacadeAPI textXML = new FileFacade(readwriteXML);
		
		InterfaceReadWrite readwriteBinary = new ReadWriteBinary();
		FileFacadeAPI textBinary = new FileFacade(readwriteBinary);
		
		List<String> programData = new ArrayList<>();
		textFacade.save(programData);
		textFacade.programDataload();
		System.out.println("---------------------------------------\n");
		
		textJSON.save(programData);
		textJSON.programDataload();
		System.out.println("---------------------------------------\n");
		
		textXML.save(programData);
		textXML.programDataload();
		System.out.println("---------------------------------------\n");
		
		textBinary.save(programData);
		textBinary.programDataload();
	}
}


/*
-----Save function called-----
Creating file...
File already exists.

File opened.

Writing into the file...
Successfully written into the file.

File closed.

-----Program Data load function called-----
File opened.

Reading file...
Text from the file
File closed.

---------------------------------------

-----Save function called-----
Creating JSON file...
Opening JSON file...
Writing to JSON file...
Closing JSON file...
-----Program Data load function called-----
Opening JSON file...
Reading JSON file...
Closing JSON file...
---------------------------------------

-----Save function called-----
Creating XML file...
Opening XML file...
Writing to XML file...
Closing XML file...
-----Program Data load function called-----
Opening XML file...
Reading XML file...
Closing XML file...
---------------------------------------

-----Save function called-----
Creating Binary file...
Opening Binary file...
Writing to Binary file...
Closing Binary file...
-----Program Data load function called-----
Opening Binary file...
Reading Binary file...
Closing Binary file... 
*/