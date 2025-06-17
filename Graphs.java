import java.util.*;

public class Graphs {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    public Graphs(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge from source to destination
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        // For undirected graph, uncomment the next line
        // adjacencyList[destination].add(source);
    }

    // Method to print the adjacency list representation of the graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjacencyList[i]) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    // Main method to test the graph
    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
