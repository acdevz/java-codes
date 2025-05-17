package AdvancedAlgorithms.Graph;

public record Edge(
        Vertex source,
        Vertex destination,
        Double weight,
        String label
){}