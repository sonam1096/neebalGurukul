//if the salary is less 30k increasea salary by 5%and print salary otherwise print salary as itis//System.out.println(fif+"x50="+(fif*50))

package com.gurukul.day01;
import java.util.*;
public class ifstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Salary");
    double salary=sc.nextDouble();
    
    if(salary<30000) 
    	salary=salary*1.05;
    	 
    else
    	salary=salary*1.10;
    
    	System.out.println("Salary:"+salary);
    
    sc.close();
	}

}

 
