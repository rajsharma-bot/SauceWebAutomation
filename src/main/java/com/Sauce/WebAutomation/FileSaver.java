package com.Sauce.WebAutomation;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
	
	public void textSaver(String text, String filename) {
		String path = System.getProperty("user.dir");
		//String FName= filename;
		try {
			 FileWriter writer = new FileWriter(path +"\\Files\\"+filename+".txt");
			 writer.write(text);
			 writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occurred while saving the text: " + e.getMessage());
		}
	}
	

}
