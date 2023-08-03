package com.neebalgurukul.day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamdemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream file;
		try {
          file=new FileInputStream("F:\\eclipse-workplace\\Project2\\src\\StockProject\\FirstTrader.txt");
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
