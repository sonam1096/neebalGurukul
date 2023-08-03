package com.gurukul.day03;

public class breakstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     one:for(int i=1;i<=5;i++)
     {
    	 for(int j=1;j<=5;j++)
    	 {
    		 if(i%2==0)
    			 continue one;
    		 if(j%2==0)
    			 break;
    		 System.out.print(j);
    		 
    	 }
    	 System.out.println();
     }
	}

}
