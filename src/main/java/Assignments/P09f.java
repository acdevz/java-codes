package Assignments;
import java.util.*;

public class P09f {
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        int E = 5; // Number of edges
        KruskalsAlgorithm.Graph graph = new KruskalsAlgorithm.Graph(V, E);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        graph.kruskalMST();
    }
}

class KruskalsAlgorithm {

    static class Edge {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int V, E;
        List<Edge> edges;

        public Graph(int V, int E) {
            this.V = V;
            this.E = E;
            edges = new ArrayList<>(E);
        }

        void addEdge(int src, int dest, int weight) {
            edges.add(new Edge(src, dest, weight));
        }

        // Find operation using Disjoint Set (Union-Find)
        int find(int[] parent, int i) {
            if (parent[i] == -1)
                return i;
            return find(parent, parent[i]);
        }

        // Union operation using Disjoint Set (Union-Find)
        void union(int[] parent, int x, int y) {
            int xSet = find(parent, x);
            int ySet = find(parent, y);
            parent[xSet] = ySet;
        }

        // Kruskal's algorithm to find Minimum Spanning Tree
        void kruskalMST() {
            Edge[] result = new Edge[V];
            int[] parent = new int[V];
            Arrays.fill(parent, -1);

            // Sort edges in non-decreasing order of their weights
            edges.sort(Comparator.comparingInt(e -> e.weight));

            int e = 0; // An index variable, used for result[]
            int i = 0; // An index variable, used for sorted edges

            while (e < V - 1 && i < E) {
                Edge nextEdge = edges.get(i++);
                int x = find(parent, nextEdge.src);
                int y = find(parent, nextEdge.dest);

                // If including this edge does not cause cycle, include it
                if (x != y) {
                    result[e++] = nextEdge;
                    union(parent, x, y);
                }
            }

            // Print the Minimum Spanning Tree
            System.out.println("Edge   Weight");
            for (i = 0; i < e; ++i)
                System.out.println(result[i].src + " - " + result[i].dest + "    " + result[i].weight);
        }
    }
}

/*Complexity Analysis :
* Time Complexity: O(ElogE) or O(ElogV). Sorting of edges takes O(ELogE) time. After sorting, we iterate through all edges and apply the find-union algorithm. The find and union operations can take at most O(LogV) time. So overall complexity is O(ELogE + ELogV) time. The value of E can be at most O(V^2), so O(LogV) are O(LogE) the same. Therefore, the overall time complexity is O(ElogE) or O(ElogV)
* Space Complexity: O(V + E)
*/

