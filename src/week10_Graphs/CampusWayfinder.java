package week10_Graphs;

import java.util.Scanner;

public class CampusWayfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Graph campus = new Graph();

        campus.addEdge("A", "B");
        campus.addEdge("A", "C");
        campus.addEdge("B", "D");
        campus.addEdge("C", "D");

        System.out.println("Adjacency list:");
        campus.printGraph();

        System.out.print("\nEnter start vertex for DFS: ");
        String dfsStart = sc.next().toUpperCase();
        campus.dfs(dfsStart);

        System.out.print("\nEnter start and target vertices for BFS: ");
        String bfsStart = sc.next().toUpperCase();
        String bfsTarget = sc.next().toUpperCase();
        campus.bfs(bfsStart, bfsTarget);

    }
}

