package com.gurukul.day14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Bufferwriter {

	public static void main(String[] args) {
		 InputStream file;
		 String fileData;
		    try {
		          file=new FileInputStream("C:\\Users\\S S\\Downloads\\Music Profile\\Music_list.txt");
		          fileData= ReadEntireStream(file);
		          int bytesRead;
		          byte[]data=new byte[10];
		          while((bytesRead=file.read(data))!=-1) {
		              fileData+=new String (data,0,bytesRead);
		              
		            }		            


		          System.out.println(fileData);
	}catch(IOException e)
	{
		System.out.println("error in i/p");

	}
	}
	private static String ReadEntireStream(InputStream file) {
 
try {
      
      String fileData="";
      int bytesRead;
      byte[]data=new byte[10];
      while((bytesRead=file.read(data))!=-1) {
        fileData+=new String (data,0,bytesRead);
        
      }
      return fileData;
}
catch(IOException e) {
System.out.println("error in i/p");
return null;

}
	}}



