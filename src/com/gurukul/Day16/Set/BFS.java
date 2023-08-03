package com.gurukul.Day16.Set;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method s

		int arr[][] = { { 0, 1, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 1, 0, 0, 1, 0 } };

	Queue<Integer> queue = new LinkedList<>();
		int s = 0;
		boolean Visited[] = new boolean[arr.length];
		Visited[s] = true;

		queue.add(s);
		while (!queue.isEmpty()) {
			s = queue.poll();
			for (int i = 0; i < arr.length; i++) {
				if (arr[s][i] == 1 && !Visited[i]) {
					System.out.print((char) (i + 65));
					queue.add(i);
					Visited[i] = true;

					
				}
			}
		}
          Stack<Integer> stack=new Stack<>();
          stack.push(s);
          boolean flag=false;
          while(!stack.isEmpty())
          {
        	  s=stack.peek();
        	  
        	  for(int i=0;i<arr.length;i++)
        	  {
        		  flag=true;
        		  stack.push(i);
        		  Visited[i]=true;
        		 System.out.print((char)(i+65));
        		 break;
        	  }
          }
          if(!flag)
		stack.pop();
	}
}