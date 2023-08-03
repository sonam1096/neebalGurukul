package com.neebalgurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class byteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis= new BufferedInputStream(System.in);
		try{
			System.out.println("enter an input");
			
			byte []a =new byte[10];
			
			
			
			bis.read(a);
			System.out.println("enter an input"+new String(a));
			
			
			
		}
			catch(Exception e) {
				System.err.println("enter an input");
				
			}
	}

}
