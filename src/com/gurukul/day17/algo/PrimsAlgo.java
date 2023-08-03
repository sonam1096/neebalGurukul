package com.gurukul.day17.algo;



import java.util.Arrays;

class AlgoNode {
    private int distance;
    private int parent;
    private int child;

    public int getDistance() {
	return distance;
    }

    public void setDistance(int distance) {
	this.distance = distance;
    }

    public int getParent() {
	return parent;
    }

    public void setParent(int parent) {
	this.parent = parent;
    }

    public int getChild() {
	return child;
    }

    public void setChild(int child) {
	this.child = child;
    }

}

public class PrimsAlgo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int mat[][] = {
		{ Integer.MAX_VALUE, 4, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
			Integer.MAX_VALUE },
		{ 4, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
			Integer.MAX_VALUE },
		{ Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2,
			1 },
		{ 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE,
			Integer.MAX_VALUE },
		{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, Integer.MAX_VALUE, 7, Integer.MAX_VALUE,
			Integer.MAX_VALUE },
		{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 7, Integer.MAX_VALUE, 6,
			Integer.MAX_VALUE },
		{ Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 5, Integer.MAX_VALUE, 6, Integer.MAX_VALUE, 7 },
		{ Integer.MAX_VALUE, Integer.MAX_VALUE, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 7,
			Integer.MAX_VALUE } };

	prims(mat);
    }

    public static int prims(int mat[][]) {
	int ans = 0;
	int distanceArr[] = new int[mat.length];
	int parent[] = new int[mat.length];
	Arrays.fill(parent, -1);

	Arrays.fill(distanceArr, Integer.MAX_VALUE);
	distanceArr[0] = 0;
	boolean[] visited = new boolean[mat.length];
	int s = 0;
	visited[s] = true;

	int count = 0;
	int min = Integer.MAX_VALUE;
	int minIndex = 0;
	while (count < mat.length) {
	    for (int i = 0; i < mat.length; i++) {
		if (!visited[i]) {
		    if (mat[s][i] < distanceArr[i]) {
			distanceArr[i] = mat[s][i];
			parent[i] = s;
			
		    }
		}
	    }
	    for (int i = 0; i < mat.length; i++) {
		if (!visited[i] && (distanceArr[i] < min)) {
		    min = distanceArr[i];
		    minIndex = i;
		}
	    }
	    min = Integer.MAX_VALUE;
	    visited[minIndex] = true;
	    s = minIndex;
	    count++;

	  
	}
	
	for (int i = 1; i < parent.length; i++) {
	    System.out.println(((char) (parent[i] + 65)) + " " + (char) (i + 65));
	    count+=parent[i];
	}
	System.out.println(count);
	return ans;
	
    }

}