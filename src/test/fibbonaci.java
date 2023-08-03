package test;
import java.util.*;
public class fibbonaci {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int X = sc.nextInt();

     
     int[] fib = new int[X];
     fib[0] = 0;
     fib[1] = 1;

  
     for (int i = 2; i < X; i++) {
         fib[i] = fib[i - 2] + fib[i - 1];
        // System.out.print(fib[i]+" ");
     }
   System.out.println();
    
     for (int i = X - 1; i >= 0; i--) {
         System.out.print(fib[i] + " ");
     }
 }
		        
}


