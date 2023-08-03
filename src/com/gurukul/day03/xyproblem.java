package com.gurukul.day03;

public class xyproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=175;
       int y=125;
       
       int div=x%y;
       while(div!=0)
       {
    	   
    	   x=y;
    	   y=div;
    	   div=x%y;
    	   
       }
		System.out.println(div);
	}

}
