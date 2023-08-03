package com.gurukul.day17.algo;

import java.util.*;
/*
class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}

class Graph {
    int V;
    List<Edge>[] adjList;

    public Graph(int v) {
        V = v;
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList[src].add(new Edge(src, dest, weight));
        adjList[dest].add(new Edge(dest, src, weight));
    }

    public List<Edge> primMST() {
        List<Edge> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

        // Start with vertex 0 (A) as the initial vertex.
        int startVertex = 0;
        visited[startVertex] = true;
        priorityQueue.addAll(adjList[startVertex]);

        while (!priorityQueue.isEmpty()) {
            Edge minEdge = priorityQueue.remove();
            int nextVertex = minEdge.dest;

            if (!visited[nextVertex]) {
                visited[nextVertex] = true;
                result.add(minEdge);
                priorityQueue.addAll(adjList[nextVertex]);
            }
        }

        return result;
    }
}

public class PrimWithEdge {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 3, 8);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 7, 1);
        
        graph.addEdge(2, 6, 2);
        graph.addEdge(3, 4, 3);
        graph.addEdge(3, 5, 4);
        graph.addEdge(3, 6, 5);
        
        graph.addEdge(4, 5, 9);
        graph.addEdge(5, 7, 2);
        graph.addEdge(5, 6, 6);
        graph.addEdge(6, 7, 7);
        

        List<Edge> minimumSpanningTree = graph.primMST();
        for (Edge edge : minimumSpanningTree) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
    }
}
        }*/

