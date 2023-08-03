package com.gurukul.day07;

import java.util.*;


class vectorproblem {
	static<T extends AbstractList<?>> void display(T t){
	   	 Iterator<?> it=t.iterator();
	   	 while(it.hasNext()) {
	   		 System.out.println(it.next());
	   	 }	
	}
	
public  vectorproblem(){ 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<>();
		arr.add("20");
		arr.add("30");
		arr.add("50");
		
		Vector<Integer> vector=new Vector<>();
		vector.add(100);
		vector.add(200);
		vector.add(400);
		
		Stack<Double> stack=new Stack<>();
		stack.add(3000.0);
		stack.add(7000.0);
		stack.add(5000.0);
       
		
		vectorproblem.display(arr);
		System.out.println();
		
		vectorproblem.display(vector);
		System.out.println();
		
		
		vectorproblem.display(stack);
		System.out.println();
		
	 }
	
	
 
}