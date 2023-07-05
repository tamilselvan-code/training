package com.coding.interview.graph;

import java.util.Set;

public class GraphTest {

	public static void main(String[] args) {
		Graph graph = new Graph();

		graph.addVertex("Bob");
		graph.addVertex("Alice");
		graph.addVertex("Mark");
		graph.addVertex("Rob");
		graph.addVertex("Maria");
		graph.addEdge("Bob", "Alice");
		graph.addEdge("Bob", "Rob");
		graph.addEdge("Alice", "Mark");
		graph.addEdge("Rob", "Mark");
		graph.addEdge("Alice", "Maria");
		graph.addEdge("Rob", "Maria");

		// DFS
		Set<String> depthFirstTraversal = graph.depthFirstTraversal(graph, "Bob");
		System.out.println("\n**** DFS ****");
		for (String data : depthFirstTraversal) {
			System.out.println("Data: " + data);
		}

		// BFS
		Set<String> breadthFirstTraversal = graph.breadthFirstTraversal(graph, "Bob");
		System.out.println("\n**** BFS ****");
		for (String data : breadthFirstTraversal) {
			System.out.println("Data: " + data);
		}
	}

}
