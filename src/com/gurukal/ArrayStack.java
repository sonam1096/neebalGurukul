package com.gurukal;

import java.util.Stack;

public class ArrayStack {
	
	
	
	public static void pushAtBottom(int data,Stack<Integer> s)  {
		int top=s.pop();
		pushAtBottom(data,s);
		s.push(top);
		
	}
	
	
	public static void main(String []args) {
		// TODO Auto-generated method stub
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4,s);
       
        
        
        while(s.isEmpty()) {
            s.push(1);
        	
        	
        }
        
	}  
}
