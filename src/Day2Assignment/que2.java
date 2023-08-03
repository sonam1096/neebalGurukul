package Day2Assignment;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		double x=sc.nextDouble();
		 x=Math.toRadians(x);
		 //System.out.println(x);
		 double fact=1,sum=1,num=x;
	     for(double i=2;i<=10;i=i+2) {
	    	 num=-num*x*x;
	    	 fact *=(i-1)*i;
	    	 if(i%2==0) {
	    	 sum +=num/fact;
	    	 } 
	     }
//	     sum=Math.toDegrees(sum);
	     System.out.println(sum);
	}

}
