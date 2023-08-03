package com.neebalgurukul.day14;

import java.io.Reader;
import java.io.*;
import java.io.BufferedInputStream;

public class BufferedReader1 {

/*	public static void main(String[] args) {
		readUsingBuffered();
		
		
	}
	private static void readUsingBuffered() {
		BufferedReader reader=new BufferedReader();
		try
		{
			String data=reader.readLine();
			System.out.println(data);
		}
		catch(IOException e)
		{
			throw new RunTimeException(e);
		}
	}
	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}*/
	 
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
}
}
