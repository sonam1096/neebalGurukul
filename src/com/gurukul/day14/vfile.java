package com.gurukul.day14;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class vfile {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    FileInputStream file;
	    try {
	          file=new FileInputStream("C:\\Users\\S S\\Downloads\\Music Profile\\Music_list.txt");
	          String fileData="";
	          int bytesRead;
	          byte[]data=new byte[10];
	          while((bytesRead=file.read(data))!=-1) {
	            fileData+=new String (data,0,bytesRead);
	            
	          }
	          System.out.println(fileData);
	    }
	catch(IOException e) {
	  System.out.println("error in i/p");
	

	  }

	}


}
