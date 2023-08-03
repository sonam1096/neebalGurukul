package areaofcircle;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a radius");
	 double r=sc.nextDouble();
     double a= Math.PI*Math.pow(r, 2);
     System.out.println("Area :"+a);
     
	}

}

