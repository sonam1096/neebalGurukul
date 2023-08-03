package com.gurukul.Day16.Set;

import java.util.Hashtable;

public class HashDemo {
                
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubh
		
				
		Hashtable<Integer,String> num=new Hashtable<>();
		num.put(1, "One");
		num.put(2, "Two");
		num.put(3, "Three");
		num.put(4, "Four");
		num.put(5, "Five");
		num.put(6, "Six");
		num.put(7, "Seven");
		num.put(8, "Eight");
		num.put(9, "three");
		num.put(0, "zero");
		//System.out.println(num.get(1)+num.get(2)+num.get(3));
		int num1=435;
		String ans = "";
		while(num1!=0) {
			int n = num1%10;
//			System.out.println(n);
			
			ans=" "+ num.get(n)+ans;
			
			num1=num1/10;
		}
		
		System.out.println(ans.trim());

		
		
		
      
	}

}
