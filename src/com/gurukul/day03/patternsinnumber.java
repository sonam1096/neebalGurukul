package com.gurukul.day03;

public class patternsinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
     for(int i=1;i<=5;i++)
     {
    	 
    	  
     for(int j=1;j<=5-i;j++) 
     {
         System.out.print(" ");
      }
     if(i==5) {
    	 i=10;
     }
     for(int j=1;j<=i;j++)
     {
    	 System.out.print("*");
    	
     }
     
     
     
    	 
     System.out.println();
     }
     for(int i=4;i>=1;i--)
     {
    	 
    	  
     for(int j=1;j<=5-i;j++) 
     {
         System.out.print(" ");
      }
     for(int j=1;j<=i;j++)
     {
    	 System.out.print(" ");
    	
     }
     for(int j=i;j>=1;j--) {
    	 System.out.print("*");
     }
     
     System.out.println();
     
    	 
     }
    
	}
	}


