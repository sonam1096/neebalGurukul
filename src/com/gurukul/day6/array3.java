package com.gurukul.day6;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int x[]= {10,11,12,20,21,22};
//		
		for(int i=0,j=(x.length+1)/2;j<x.length;i++,j++) {
			  
				  int t=x[i];
				  x[i]=x[j];
				  x[j]=t;
//				  
			  
		}
		for(int i=0;i<x.length;i++)
		System.out.print(x[i]+" ");
	}

}
