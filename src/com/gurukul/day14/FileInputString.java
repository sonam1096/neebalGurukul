package com.gurukul.day14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputString {

	private static void readFromFile() {
		// TODO Auto-generated method stub
		
// TODO Auto-generated method stub
     
		try {
		FileInputStream file=new FileInputStream ("C:\\Users\\S S\\Downloads\\Music Profile\\Music_list.txt");
		byte[] data = new byte[5];
		
		String fileData = "";
		int byteRead = 0;
		while ((file.read(data)!= -1)) {
			
			 
			fileData += new String(data, 0, byteRead);

			  
		}
		System.out.println(fileData);
		}
		
		catch(IOException e)
		{
			System.err.println("Error "+e);
		
	} 
}
		public static void main(String[] args) {
			//FileInputStream file=new FileInputStream ("C:\\Users\\S S\\Downloads\\Music Profile\\Music_list.txt");
			readFromFile();
		//file.readFromFile(file);
		
	}
		
}
