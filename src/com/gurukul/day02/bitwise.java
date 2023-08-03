package com.gurukul.day02;
import java.util.*;
public class bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.print("Enter a Number:");
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    
		    System.out.println("Bit:"+((x>>(n-1))&1));
	}

}
