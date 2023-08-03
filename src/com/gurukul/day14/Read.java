package com.gurukul.day14;
import java.util.*;

import java.io.IOException;
import java.io.InputStream;
public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter");
     String s=sc.nextLine();
     String[] str=s.split(" ");
     System.out.println(" "+str);
	

		
		try
		{
			System.out.println("Enter an input:");
			int a=System.in.read();
			System.out.println("input was:"+a);
		
			
		}
		catch(IOException e)
		{
			System.out.println("Error in input");
		}
			
		}
		
		
	
}
