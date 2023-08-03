package com.gurukul.day03;
import java.util.*;
public class tsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    
//	    int sub;
//	    while(x!=y)
//	    {
//	    	if(x>y)
//	    	
//	    		x=x-y;
//	    	    
//	    	else
//	    		y=y-x;
//	    	
//	    }
//	    System.out.println(x);
	    
	    int ans=0;
	    while(x!=0) {
	    	if(x%2!=0)
	    		ans=ans+y;
	    	x=x>>1;
	    	y=y<<1;
	    }
	    System.out.println(ans);

	}

}
