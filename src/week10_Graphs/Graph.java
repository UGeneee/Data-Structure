package week10_Graphs;

import java.util.*;

public class Graph {
    private HashMap<String, List<String>> adjList = new HashMap<>();

    public void addEdge(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    public void dfs(String start) {
        if (!adjList.containsKey(start)) {
            System.out.println("Starting vertex not found.");
            return;
        }
        Set<String> visited = new HashSet<>();
        List<String> visitationOrder = new ArrayList<>();

        dfsHelper(start, visited, visitationOrder);

        System.out.println("DFS order: " + String.join(" ", visitationOrder));
    }

    private void dfsHelper(String current, Set<String> visited, List<String> order) {
        visited.add(current);
        order.add(current);

        for (String neighbor : adjList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited, order);
            }
        }
    }

    public void bfs(String start, String target) {
        if (!adjList.containsKey(start) || !adjList.containsKey(target)) {
            System.out.println("Start or target vertex not found.");
            return;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        HashMap<String, String> parentMap = new HashMap<>();
        List<String> visitationOrder = new ArrayList<>();

        queue.add(start);
        visited.add(start);
        parentMap.put(start, null);

        boolean found = false;

        while (!queue.isEmpty()) {
            String current = queue.poll();
            visitationOrder.add(current);

            if (current.equals(target)) {
                found = true;
                break;
            }

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parentMap.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        if (found) {
            List<String> path = new ArrayList<>();
            for (String at = target; at != null; at = parentMap.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            System.out.println("BFS shortest path from " + start + " to " + target + ": " + path);
        } else {
            System.out.println("No path exists between " + start + " and " + target + ".");
        }
    }
}

