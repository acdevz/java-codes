package AdvancedAlgorithms.Graph;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        try {
            graph.addEdge(v1, v3);
            graph.addEdge(v3, v2);
            graph.addEdge(v2, v1);
            graph.addEdge(v3, v5);
            graph.addEdge(v3, v4);
            graph.addEdge(v4, v5);
            graph.addEdge(v5, v6);
            graph.addEdge(v6, v4);
        } catch (NodeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Map<Vertex, Integer> inTime = new HashMap<>();
        Map<Vertex, Integer> outTime = new HashMap<>();
        for(Vertex v: graph.vertices){
            if(!inTime.containsKey(v)){
                dfs(graph, v, new int[]{0}, inTime, outTime);
            }
        }

        /* DFS */
        System.out.println("In Time: " + inTime);
        System.out.println("Out Time: " + outTime);
        System.out.println("DFS Traversal:");
        for(Vertex v: graph.vertices){
            System.out.println(v.label() + " In Time: " + inTime.get(v) + " Out Time: " + outTime.get(v));
        }
        System.out.print("Topological Ordering: ");
        var topologicalOrdering = inTime.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .map(Vertex::label)
                .collect(Collectors.joining(" -> "));
        System.out.println(topologicalOrdering);

        /* BFS */
        Map<Vertex, Integer> distances = new HashMap<>();
        Map<Vertex, Vertex> parents = new HashMap<>();
        bfs(graph, v1, distances, parents);
        System.out.println("BFS Traversal:");
        for(Vertex v: graph.vertices){
            System.out.println(v.label() + " Distance: " + distances.get(v) + " Parent: " + (parents.get(v) != null ? parents.get(v).label() : "null"));
        }
        if(!parents.containsKey(v6)){
            System.out.println("No path from " + v1.label() + " to " + v6.label());
            return;
        }
        System.out.print("Shortest Path from " + v1.label() + " to " + v6.label() + ": ");
        List<Vertex> path = new ArrayList<>();
        Vertex current = v6;
        while(current != null){
            path.add(current);
            current = parents.get(current);
        }
        Collections.reverse(path);
        var shortestPath = path.stream()
                .map(Vertex::label)
                .collect(Collectors.joining(" -> "));
        System.out.println(shortestPath);

        /* Dijkstra's Algorithm */
        Map<Vertex, Double> dijkstraDistances = new HashMap<>();
        Map<Vertex, Vertex> dijkstraParents = new HashMap<>();
        for(Vertex v: graph.vertices){
            dijkstraDistances.put(v, Double.POSITIVE_INFINITY);
        }
        dijkstras(graph, v1, dijkstraDistances, dijkstraParents);
        System.out.println("Dijkstra's Algorithm Traversal:");
        for(Vertex v: graph.vertices){
            System.out.println(v.label() + " Distance: " + dijkstraDistances.get(v) + " Parent: " + (dijkstraParents.get(v) != null ? dijkstraParents.get(v).label() : "null"));
        }

        /* A* Star */
        Map<Vertex, Double> aStarDistances = new HashMap<>();
        Map<Vertex, Vertex> aStarParents = new HashMap<>();
        for(Vertex v: graph.vertices){
            aStarDistances.put(v, Double.POSITIVE_INFINITY);
        }
        aStar(graph, v1, v6, aStarDistances, aStarParents,
                edge -> edge.weight(),
                vertex -> 0.0
        );
        System.out.println("A* Algorithm Traversal:");
        for(Vertex v: graph.vertices){
            System.out.println(v.label() + " Distance: " + aStarDistances.get(v) + " Parent: " + (aStarParents.get(v) != null ? aStarParents.get(v).label() : "null"));
        }
    }

    public static void dfs(Graph graph, Vertex v, int[] time, Map<Vertex, Integer> inTime, Map<Vertex, Integer> outTime){
        time[0]++;
        inTime.put(v, time[0]);
        for(Edge e: graph.adjacencyList.get(v)){
            Vertex u = e.destination();
            if(!inTime.containsKey(u))
                dfs(graph, u, time, inTime, outTime);
            else{
                if(!outTime.containsKey(u)){
                    System.out.println("Cycle detected: " + v.label() + " -> " + u.label());
                }
            }
        }
        time[0]++;
        outTime.put(v, time[0]);
    }

    public static void bfs(Graph graph, Vertex start, Map<Vertex, Integer> distances, Map<Vertex, Vertex> parents){
        Queue<Vertex> queue = new LinkedList<>();
        distances.put(start, 0);
        parents.put(start, null);
        queue.add(start);
        while(!queue.isEmpty()){
            Vertex u = queue.poll();
            for(Edge e : graph.adjacencyList.get(u)){
                Vertex v = e.destination();
                if(!distances.containsKey(v)){
                    distances.put(v, distances.get(u) + 1);
                    parents.put(v, u);
                    queue.add(v);
                }
            }
        }
    }

    public static void dijkstras(Graph graph, Vertex start, Map<Vertex, Double> distances, Map<Vertex, Vertex> parents) {
        Queue<Map.Entry<Vertex, Double>> queue = new PriorityQueue<>((u, v) -> u.getValue().compareTo(v.getValue()));
        distances.put(start, 0.0);
        parents.put(start, null);
        queue.add(Map.entry(start, 0.0));
        while (!queue.isEmpty()) {
            Vertex u = queue.peek().getKey();
            queue.poll();
            for (Edge e : graph.adjacencyList.get(u)) {
                Vertex v = e.destination();
                Double w = e.weight();
                if (distances.get(u) + w < distances.get(v)) {
                    distances.put(v, distances.get(u) + w);
                    parents.put(v, u);
                    queue.add(Map.entry(v, distances.get(v)));
                }
            }
        }
    }

    public static void aStar(Graph graph, Vertex start, Vertex isGoal, Map<Vertex, Double> distances, Map<Vertex, Vertex> parents, Function<Edge, Double> distance, Function<Vertex, Double> heuristics){
        Queue<Map.Entry<Vertex, Double>> queue = new PriorityQueue<>((u, v) -> u.getValue().compareTo(v.getValue()));
        Map<Vertex, Double> fScore = new HashMap<>();
        for(Vertex v: graph.vertices){
            fScore.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);
        parents.put(start, null);
        fScore.put(start, heuristics.apply(start));
        queue.add(Map.entry(start, 0.0));
        while (!queue.isEmpty()) {
            Vertex u = queue.peek().getKey();
            queue.poll();
            if(u.equals(isGoal)){
                break;
            }
            for (Edge e : graph.adjacencyList.get(u)) {
                Vertex v = e.destination();
                if (distances.get(u) + distance.apply(e) < distances.get(v)) {
                    distances.put(v, distances.get(u) + distance.apply(e));
                    fScore.put(v, distances.get(v) + heuristics.apply(v));
                    parents.put(v, u);
                    queue.add(Map.entry(v, fScore.get(v)));
                }
            }
        }
    }
}


