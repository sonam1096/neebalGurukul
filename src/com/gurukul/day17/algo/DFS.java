package com.gurukul.day17.algo;

 

import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int mat[][] = { { 0, 1, 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 1, 1 },
		{ 1, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1, 0, 1 }, { 0, 1, 1, 1, 0, 1, 0 } };
	System.out.println(dfs(mat));
    }

    public static String dfs(int mat[][]) {
	String ans = "";
	Stack<Integer> stack = new Stack<>();
	boolean[] visited = new boolean[mat.length];
	int s = 0;
	visited[s] = true;
	stack.add(s);
	ans += (char) (s + 65) + " ";
	while (!stack.isEmpty()) {
	    s = stack.peek();
	    boolean flag = false;
	    for (int i = 0; i < mat.length; i++) {
		if (mat[s][i] == 1 && !visited[i]) {
		    ans += (char) (i + 65) + " ";
		    stack.add(i);
		    flag = true;
		    visited[i] = true;
		    break;
		}
	    }
	    if (!flag) {
		stack.pop();
	    }
	}
	return ans;
    }

}

