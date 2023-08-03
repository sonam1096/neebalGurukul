package com.gurukul.day17.algo;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int mat[][] = { { 0, 1, 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 1, 1 },
		{ 1, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1, 0, 1 }, { 0, 1, 1, 1, 0, 1, 0 } };
	System.out.println(bfs(mat));

    }

    public static String bfs(int mat[][]) {
	String ans = "";
	Queue<Integer> q = new LinkedList<>();
	boolean[] visited = new boolean[mat.length];
	int s = 0;
	visited[s] = true;
	q.add(s);
	ans += (char) (s + 65) + " ";
	while (!q.isEmpty()) {
	    s = q.poll();
	    for (int i = 0; i < mat.length; i++) {
		if (mat[s][i] == 1 && !visited[i]) {
		    ans += (char) (i + 65) + " ";
		    q.add(i);
		    visited[i] = true;
		}
	    }
	}

	return ans;
    }

}