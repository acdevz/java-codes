package Assignments;
import java.util.Arrays;

public class P12d {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };

        int m = 3;
        int[] colors = new int[graph.length]; // Array.java to store the colors of the vertices

        // Attempt to color the graph with the specified number of colors
        if (GraphColoring.graphColoring(graph, m, colors, 0)) {
            GraphColoring.printColoring(colors); // Print the successful coloring
        } else {
            System.out.println("No solution found with " + m + " colors.");
        }
    }
}


class GraphColoring {

    // Recursive method to solve the graph coloring problem using backtracking
    public static boolean graphColoring(int[][] graph, int m, int[] colors, int vertex) {
        int n = graph.length; // Number of vertices

        if (vertex == n) {
            return true; // All vertices have been successfully colored
        }

        // Try different colors for the current vertex
        for (int color = 1; color <= m; color++) {
            if (isSafe(graph, colors, vertex, color)) {
                colors[vertex] = color; // Assign the color

                // Recur to color the next vertex
                if (graphColoring(graph, m, colors, vertex + 1)) {
                    return true; // If successful, return true
                }

                // If not successful, backtrack
                colors[vertex] = 0; // Reset the color
            }
        }

        return false; // If no valid color found, return false
    }

    // Method to check if it's safe to color a given vertex with a specific color
    private static boolean isSafe(int[][] graph, int[] colors, int vertex, int color) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[vertex][i] == 1 && colors[i] == color) {
                // If there's an edge between the vertices and the adjacent vertex has the same color
                return false;
            }
        }
        return true; // Safe to color
    }

    // Helper method to print the coloring of the graph
    public static void printColoring(int[] colors) {
        System.out.println("Graph Coloring:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Vertex " + i + " has color " + colors[i]);
        }
    }
}

