package Assignments;
import java.util.*;

public class P09e {
    public static void main(String[] args) {
        int V = 5;
        PrimAlgorithm.Graph graph = new PrimAlgorithm.Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        graph.primMST();
    }
}

class PrimAlgorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int V;
        List<List<Edge>> adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int src, int dest, int weight) {
            Edge edge1 = new Edge(src, dest, weight);
            Edge edge2 = new Edge(dest, src, weight);
            adj.get(src).add(edge1);
            adj.get(dest).add(edge2);
        }

        void primMST() {
            boolean[] inMST = new boolean[V];
            int[] parent = new int[V];
            int[] key = new int[V];

            Arrays.fill(key, Integer.MAX_VALUE);
            Arrays.fill(parent, -1);

            PriorityQueue<Edge> pq = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.weight));
            key[0] = 0;
            pq.offer(new Edge(-1, 0, 0));

            while (!pq.isEmpty()) {
                Edge minEdge = pq.poll();
                int u = minEdge.dest;

                if (inMST[u])
                    continue;

                inMST[u] = true;

                for (Edge edge : adj.get(u)) {
                    int v = edge.dest;
                    int weight = edge.weight;
                    if (!inMST[v] && weight < key[v]) {
                        key[v] = weight;
                        parent[v] = u;
                        pq.offer(new Edge(u, v, weight));
                    }
                }
            }

            // Print the Minimum Spanning Tree
            System.out.println("Edge   Weight");
            for (int i = 1; i < V; i++) {
                System.out.println(parent[i] + " - " + i + "    " + key[i]);
            }
        }
    }
}

/*Complexity Analysis :
* Time Complexity: O(E log V)
* If we use a priority queue, the time complexity will be O(E log V))
* we are using a priority queue to store the vertices and their keys, the time complexity will be O(E log V).
* and if we use an adjacency list to store the graph, the time complexity will be O(E log V).
* and if we use an adjacency matrix to store the graph, the time complexity will be O(V^2).
* Space Complexity: O(V + E)
*/
