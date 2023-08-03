package com.gurukul.day17.algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Edgee {
	private int parent, child, cost;

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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Edgee(int parent, int child, int cost) {
		super();
		this.parent = parent;
		this.child = child;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Edgee [parent=" + ((char) (parent + 65)) + ", child=" + (char) (child + 65) + ", cost=" + cost + "]";
	}

}

public class DijikstraWithEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Edgee> distance = new PriorityQueue<>(new Comparator<Edgee>() {

			@Override
			public int compare(Edgee o1, Edgee o2) {
				// TODO Auto-generated method stub
				return o1.getCost() - o2.getCost();
			}
		});
		int nodes = 8;

		Map<Integer, List<Edgee>> graph = new HashMap<>();

		// A
		List<Edgee> edgeAList = new ArrayList<>();
		edgeAList.add(new Edgee(0, 1, 4));
		edgeAList.add(new Edgee(0, 3, 8));
		graph.put(0, edgeAList);

		// B
		List<Edgee> edgeBList = new ArrayList<>();
		edgeBList.add(new Edgee(1, 0, 4));
		edgeBList.add(new Edgee(1, 2, 3));
		graph.put(1, edgeBList);

		// C
		List<Edgee> edgeCList = new ArrayList<>();
		edgeCList.add(new Edgee(2, 1, 3));
		edgeCList.add(new Edgee(2, 6, 2));
		edgeCList.add(new Edgee(2, 7, 1));
		graph.put(2, edgeCList);

		// D
		List<Edgee> edgeDList = new ArrayList<>();
		edgeDList.add(new Edgee(3, 0, 8));
		edgeDList.add(new Edgee(3, 4, 3));
		edgeDList.add(new Edgee(3, 5, 4));
		edgeDList.add(new Edgee(3, 6, 5));
		graph.put(3, edgeDList);

		// E
		List<Edgee> edgeEList = new ArrayList<>();
		edgeEList.add(new Edgee(4, 3, 3));
		edgeEList.add(new Edgee(4, 5, 9));
		graph.put(4, edgeEList);

		// F
		List<Edgee> edgeFList = new ArrayList<>();
		edgeFList.add(new Edgee(5, 3, 4));
		edgeFList.add(new Edgee(5, 4, 9));
		edgeFList.add(new Edgee(5, 6, 6));
		edgeFList.add(new Edgee(5, 7, 2));
		graph.put(5, edgeFList);

		// G
		List<Edgee> edgeGList = new ArrayList<>();
		edgeGList.add(new Edgee(6, 2, 2));
		edgeGList.add(new Edgee(6, 3, 5));
		edgeGList.add(new Edgee(6, 5, 6));
		edgeGList.add(new Edgee(6, 7, 7));
		graph.put(6, edgeGList);

		// H
		List<Edgee> edgeHList = new ArrayList<>();
		edgeHList.add(new Edgee(7, 2, 1));
		edgeHList.add(new Edgee(7, 5, 2));
		edgeHList.add(new Edgee(7, 6, 7));
		graph.put(7, edgeHList);
		int start = 0;
		int sum = 0;
		boolean visited[] = new boolean[nodes];
		int parent[] = new int[nodes];
		visited[start] = true;
        int parentCost=0;
        
		for (int count = 1; count < nodes; count++) {

			List<Edgee> list = graph.get(start);
			for (int i = 0; i < list.size(); i++) {

				Edgee edge = list.get(i);
				int j = edge.getChild();
				edge.setCost(edge.getCost()+parentCost);
				if (!visited[j]) {
					distance.add(edge);
				}
			}
			Edgee selected = distance.poll();
			start = selected.getChild();
			sum += selected.getCost();
			visited[start] = true;
			System.out.println(selected);
			parentCost=selected.getCost();

		}

		System.out.println(sum);
	}

}
