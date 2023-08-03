package com.neebalgurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class bufferdfileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis= new BufferedInputStream(System.in);
		try{
			System.out.println("enter an input");
			
			int a=bis.read();
			System.out.println("enter an input"+a);
		}
			catch(IOException e) {
				System.err.println("enter an input");
				
			}
			
		
		
	}

}
