package com.neebalgurukul.day14;
import java.io.IOException;
import java.util.Scanner;

public class CollectionsOfInputAndOutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Scanner sc=new Scanner (System.in);
//       System.out.println("hi in the num");
//       int a =sc.nextInt();
//       int c =sc.nextInt();
//       int b=a+c;
//       System.out.println(b);
		try{
		System.out.println("enter an input");
		
		int a=System.in.read();
		System.out.println("enter an input"+a);
	}
		catch(IOException e) {
			System.err.println("enter an input");
			
		}
	}

}
