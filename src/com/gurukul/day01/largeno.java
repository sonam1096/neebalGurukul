package com.gurukul.day01;
import java.util.*;
public class largeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    //a=10,b=5
   double x;
    if(a<b) 
    	x=b/a;
    	 
    else
    	x=a/b;
    
     System.out.println("Division:"+x);
    
    sc.close();
	}

}

 
