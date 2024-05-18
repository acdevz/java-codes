package Assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P10d {
    public static void main(String[] args) {
        List<List<Integer>> adj = List.of(
            List.of(),
            List.of(2, 5),
            List.of(1, 3, 5),
            List.of(2, 5, 4),
            List.of(3, 5),
            List.of(1, 2, 3, 4)
        );

        System.out.println("BFS : " + BFS.bfs(adj, 1));
        System.out.println("DFS : " + DFS.dfs(adj, 1));
    }
}

class BFS{
    public static List<Integer> bfs(List<List<Integer>> adj, int S){
        int V = adj.size();
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[V];
        List<Integer> res = new LinkedList<>();

        visited[S] = 1;
        q.add(S);

        while(!q.isEmpty()){
            int u = q.poll();
            res.add(u);
            for(int v : adj.get(u)){
                if(visited[v] == 0){
                    visited[v] = 1;
                    q.add(v);
                }
            }
        }

        return res;
    }
}

class DFS{
    public static void dfsHelper(int node, List<List<Integer>> adj, int[] visited, List<Integer> res){
        visited[node] = 1;
        res.add(node);
        for(int v : adj.get(node)){
            if(visited[v] == 0){
                dfsHelper(v, adj, visited, res);
            }
        }
    }

    public static List<Integer> dfs(List<List<Integer>> adj, int S){
        int V = adj.size();
        List<Integer> res = new LinkedList<>();
        int[] visited = new int[V];
        dfsHelper(S, adj, visited, res);
        return res;
    }
}
