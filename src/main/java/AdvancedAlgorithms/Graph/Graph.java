package AdvancedAlgorithms.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph{
    List<Vertex> vertices;
    Map<Vertex, List<Edge>> adjacencyList;

    public Graph(){
        this.vertices = new ArrayList<>();
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(Vertex vertex){
        this.vertices.add(vertex);
        this.adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex destination) throws NodeNotFoundException {
        if(!this.adjacencyList.containsKey(source) || !this.adjacencyList.containsKey(destination)){
            throw new NodeNotFoundException("Source or destination vertex not found in the graph");
        }
        Edge edge = new Edge(source, destination, 1.0 , "default");
        this.adjacencyList.get(source).add(edge);
    }

    public void addEdge(Vertex source, Vertex destination, Double weight) throws NodeNotFoundException {
        if(!this.adjacencyList.containsKey(source) || !this.adjacencyList.containsKey(destination)){
            throw new NodeNotFoundException("Source or destination vertex not found in the graph");
        }
        Edge edge = new Edge(source, destination, weight , "default");
        this.adjacencyList.get(source).add(edge);
    }

    public void addEdge(Vertex source, Vertex destination, Double weight, String label) throws NodeNotFoundException {
        if(!this.adjacencyList.containsKey(source) || !this.adjacencyList.containsKey(destination)){
            throw new NodeNotFoundException("Source or destination vertex not found in the graph");
        }
        Edge edge = new Edge(source, destination, weight , label);
        this.adjacencyList.get(source).add(edge);
    }

    public boolean areAdjacent(Vertex source, Vertex destination) throws NodeNotFoundException {
        if(!this.adjacencyList.containsKey(source) || !this.adjacencyList.containsKey(destination)){
            throw new NodeNotFoundException("Source or destination vertex not found in the graph");
        }
        return this.adjacencyList.get(source).stream().anyMatch(edge -> edge.destination().equals(destination));
    }
}

