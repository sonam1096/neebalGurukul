package test;
import java.util.*;
public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//	     System.out.print("Enter the number: ");
//	     int n=sc.nextInt();
	     int x[]= {0,1,2,4,5,3,6,7,8,10,3,4,5,6,7,8};
	     
	     int max=1,len=1,i;
	     for(i=1;i<x.length;i++) {
	    	if(x[i]==x[i-1]+1) {
	    //	System.out.println(i);
	    	len++;
	    	}
	    	else
	    		max=Math.max(max, len);
	    	len=1;
	    		
	     }
	     max=Math.max(max, len);
	     System.out.println(max);
	}

}
