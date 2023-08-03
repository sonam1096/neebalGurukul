package test;
import java.util.*;
public class starPattern {
 

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	      
	    int row, i, j, space = 2;  
	    System.out.print("Enter the number: ");  
	    Scanner sc = new Scanner(System.in);  
	    row = sc.nextInt();  
	    space = row - 1;  
	    for (i = 1; i<= row; i++)  
	    {  
	    for (j = 1; j<= space; j++)  
	    {  
	    System.out.print(" ");  
	    }  
	    space--;  
	    for (j = 1; j <= 2 * i -1; j++)  
	    { 
	    if(j%2!=0)
	    System.out.print(" *");  
	    }  
	    
	    System.out.println("  ");  
	    }  
	    space = 2;  
	    for (i = 1; i<= row - 1; i++)  
	    {  
	    for (j = 1; j<= space; j++)  
	      
	    {  
	    System.out.print(" ");  
	    }  
	    }
	   
	}

}
