package com.gurukul.day6;

import java.util.*;
 
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		
		int n=sc.nextInt();
		double x[]=new double[n];
		
		double sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number");
			double y=sc.nextDouble();
			x[i]=y;
			sum=sum+x[i];
			
		}
		System.out.println("sum:"+sum);
		
		
		double avg=sum/n;
	     System.out.println("Avg:"+avg);
		 
		double var=0;
		for(int i=1;i<n;i++) {
			var += Math.pow(x[i]-avg,2);
		}
		System.out.println("Variance:"+var);
		
		double sd=Math.sqrt(var);

	     System.out.println("Standard deviation"+sd);
		 
		 
		 
		 
		
	}

}
