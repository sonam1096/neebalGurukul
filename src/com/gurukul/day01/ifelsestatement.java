//ip salary if sal is greater than 15lacs charge 30*of income as tax if salary is 10lacs to 15lac then charge 20% tax
//7.5 lacs to 10lac charge 10%
package com.gurukul.day01;

import java.util.Scanner;

public class ifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Salary");
	    double salary=sc.nextDouble();
	     
	    double tax;
	    if(salary>1500000)
	     	tax=salary*0.3;
	    else
	    	if(salary<1000000 )
	    		tax=salary*0.2;
	    	else
	    		tax=salary*1.10;
	    
	    double taxPaid=salary-tax;
	    System.out.println("Salary:"+salary);
	    System.out.println("Tax:"+tax);
	    System.out.println("Tax paid:"+taxPaid);

	}

}
