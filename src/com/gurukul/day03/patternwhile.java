package com.gurukul.day03;

public class patternwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int r=5;
        
        int i=1,j=0;
        
        while(i<=5) {
        	  j=1;
        	while(j<=(5-i)) {
        		System.out.print(" ");
        		j++;
        	}
        	j=i;
        	while(j>=1) {
        		System.out.print(j);
        		j--;
        	}
        	j=2;
        	while(j<=i) {
        		System.out.print(j);
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        
        
        
        
        
        
        
        
	}

}
