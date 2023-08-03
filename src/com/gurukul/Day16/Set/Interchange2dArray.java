package com.gurukul.Day16.Set;

public class Interchange2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][]= {{7,8,9,10},{9,11,12,13},{14,15,16,17}};
	     //System.out.println(a.length);
	    int max=0,min=0,m=0,n=0;
	          for (int i=0;i<a.length;i++)
	          {
	        	  for(int j=0;j<a[i].length;j++)
	        	  {
	        		  if(max<=a[i][j]) {
	        			  max=a[i][j];
	        			  m=i;
	        	  
	        		  }	 
	        	 
	        		  if(min>=a[i][j]) {
	        				 min=a[i][j];
	        				 n=i;
	        			  
	        				// System.out.print(min);
	        		  }
	        	  
	          }
		}
	          int arr[]=a[n];
	          a[n]=a[m];
	          a[m]=arr;
	          
	          for(int i=0;i<a.length;i++) 
	          {
	        	  for(int j=0;j<a[i].length;j++) {
	        		  
	        		  System.out.print(" \t"+ a[i][j] 
	        				  );
	        	  }
	          }
	        	  

	}

}
