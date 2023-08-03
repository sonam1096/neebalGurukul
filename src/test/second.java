package test;
import java.util.*;
public class second {

public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	 int row, i, j, space = 1;  
	    System.out.print("Enter the number: ");  
	    Scanner sc = new Scanner(System.in);  
	    row = sc.nextInt();  
	    space = row - 1;  
	    for (j = 1; j<= row; j++)  
	    {  
	    for (i = 1; i<= space; i++)  
	    {  
	    System.out.print(" ");  
	    }  
	    space--;  
	    for (i = 1; i <= 2 * j -1; i++)  
	    { 
	    System.out.print("*");  
	    }  
	    System.out.println(" ");  
	    }  
	    space = 1;  
	    for (j = 1; j<= row - 1; j++)  
	    {  
	    for (i = 1; i<= space; i++)  
	    {  
	    System.out.print(" ");  
	    }  
	    }
	  }


/*
int maxLength = 1;
int Length = 1;

for (int i = 1; i < arr.length; i++) {
    if (arr[i] == arr[i - 1] + 1) {
        Length++;
    } else {
        maxLength = Math.max(maxLength, Length);
        Length = 1;
    }
}


maxLength = Math.max(maxLength, Length);

return maxLength;
}
	      
		   
 */
		
}

