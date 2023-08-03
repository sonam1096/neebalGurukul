package Day2Assignment;

import java.util.*;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter an angle");
		double x = sc.nextDouble();
		x = Math.toRadians(x);

		System.out.print("Enter a number");
		int number = sc.nextInt();

		double sum = 1;
		double num = -(Math.pow(x, 2));

		double fact = 1;

		for(int i=1;i<=number;i++) {

			fact = fact*i;
			if(i%2==0) {
				sum = sum + ((num)/fact);
				num = - num*x*x;
			}
		}
		System.out.print(sum);
}
}


