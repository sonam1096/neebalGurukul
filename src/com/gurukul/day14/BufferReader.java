package com.gurukul.day14;

	import java.io.BufferedInputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStream;

	public class BufferReader {

	  private void readUsingBufferedStream() {
	      InputStream bis;
	      
	      try {
	       bis = new FileInputStream("C:\\\\Users\\\\S S\\\\Downloads\\\\Music Profile\\\\Music_list.txt");
	       String fileData = "";
	       int byteRead;
	       byte data[] = new byte[10];
	       
	       try {
	        while((byteRead = bis.read(data)) != -1) {
	         fileData += new String(data, 0, byteRead);
	        }
	       } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	       }   
	       
	       System.out.println(fileData);
	       
	       
	      } catch (FileNotFoundException e) {
	      
	       System.out.println("Error");
	      }
	     }
	     
	     
	     private void readFromFile() {
	      FileInputStream fis;
	      try {
	       fis = new FileInputStream("C:\\\\Users\\\\S S\\\\Downloads\\\\Music Profile\\\\Music_list.txt");
	       String fileData = StringTest(fis);
	       System.out.println(fileData);
	      
	      } catch (IOException e) {
	       e.printStackTrace();
	      System.out.println("Error");
	     }
	    }
	     
	     private String StringTest(InputStream in) {
	      
	      try {
	       String fileData = "";
	       int byteRead;
	       byte data[] = new byte[10];
	      
	       while((byteRead = in.read(data)) != -1) {
	        fileData += new String(data, 0, byteRead);
	       }
	       return fileData;
	      } catch (IOException e) {
	       e.printStackTrace();
	       return null;
	      }
	      finally {
	        try {
	          in.close();
	        }
	        catch(IOException e) {
	          e.printStackTrace();
	        }
	      }
	     }
	     
	     
	     public static void main(String[] args) {

	    	 BufferReader obj = new BufferReader(); 
	     
	      obj.readFromFile();  
	    //  obj.readUsingBufferedStream();  
	      
	     
	     
	    

	}

}
