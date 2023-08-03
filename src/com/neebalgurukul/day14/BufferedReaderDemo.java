package com.neebalgurukul.day14;




	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class BufferedReaderDemo {

	  private static void readUsingReader() {
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String data;
	    try {
	      data = reader.readLine();
	      System.out.println(data);
	    } catch (IOException e) {
	      throw new RuntimeException(e);
	    } finally {
	      try {
	        reader.close();
	      } catch (IOException e) {
	        throw new RuntimeException(e);      
	      }
	    }
	  }
	  
	  private static void readUsingFileReader()  {
	    
	    FileReader fileReader;
	    String data;
	    try{
	      fileReader = new FileReader("C:\\Users\\S S\\eclipse-workspace\\helloworld\\src\\helloworld\\areaofcircle.java");
	      char[] chars = new char[10];
	      int characterRead;
	      String fileData = "";
	      while((characterRead = fileReader.read(chars)) != -1) {
	        fileData += new String(chars, 0, characterRead);
	      }
	      System.out.println(fileData);
	    } catch (IOException e) {
	      throw new RuntimeException(e);
	    } 
	  }
	  
	  
	  public static void main(String[] args) {
	    readUsingFileReader();
	    
	  }

	}

	
	

