package com.gurukul.day03;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int num=n;
		int num2=n;
		double sum=0;
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		num=n;
		while(num!=0) {
			int digit =num%10;
			sum=sum+Math.pow(digit, count);
			num=num/10;
			
			
		}
		if(num2==sum)
          System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
			
			
			
			
		
		
		
//       int x=84925;
//       int large=0;
//       int mod;
//       while(x!=0) {
//    	   mod=x%10;
//    	   if(mod>large)
//              large=mod;    	   
//    	   x=x/10;
//    	   
//    		   
//       }
//       System.out.println(large);
       
//       int sum=0;
//       
//       while(x!=0)
//       {
//    	   
//    	   sum=sum+x%10;
//    	   x=x/10;
//    	   
//       }
//       System.out.println(sum);
       
//       int rev=0;
//     
//     while(x!=0)
//     {
//  	   
//  	   rev=rev*10+x%10;
//  	   x=x/10;
//  	   
//     }
//     System.out.println(rev);
	}

}
