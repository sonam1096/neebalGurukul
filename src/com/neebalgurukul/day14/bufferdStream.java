package com.neebalgurukul.day14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class bufferdStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream bis;
		try{
			bis= new BufferedInputStream(new FileInputStream("F:\\eclipse-workplace\\Project2\\src\\StockProject\\FirstTrader.txt"));
			System.out.println("enter an input");
			
			String fileData="";
	          int bytesRead;
	          byte[]data=new byte[10];
	          while((bytesRead=bis.read(data))!=-1) {
	        	  fileData+=new String (data,0,bytesRead);
		}
	          
	          System.out.println(fileData);
		}
			catch(IOException e) {
				System.err.println("enter an input");
				
			}
			
	}
		
	

}
