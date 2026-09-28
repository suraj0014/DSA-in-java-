import java.util.*;

public class DijkstraExample {

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static void addEdge(ArrayList<ArrayList<Edge>> graph,
                        int from, int to, int weight) {

        graph.get(from).add(new Edge(to, weight));
    }

    static void dijkstra(ArrayList<ArrayList<Edge>> graph, int source) {

        int n = graph.size();

        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        for (int i = 0; i < n; i++) {

            int current = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] &&
                    (current == -1 ||
                     distance[j] < distance[current])) {

                    current = j;
                }
            }

            if (current == -1 ||
                distance[current] == Integer.MAX_VALUE) {
                break;
            }

            visited[current] = true;

            for (Edge edge : graph.get(current)) {

                int next = edge.to;

                int newDistance =
                        distance[current] + edge.weight;

                if (newDistance < distance[next]) {
                    distance[next] = newDistance;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(
                "0 -> " + i + " = " + distance[i]
            );
        }
    }

    public static void main(String[] args) {

        int vertices = 7;

        ArrayList<ArrayList<Edge>> graph =
                new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 2);
        addEdge(graph, 1, 3, 1);
        addEdge(graph, 3, 4, 1);

        addEdge(graph, 0, 2, 4);
        addEdge(graph, 2, 4, 3);
        addEdge(graph, 2, 3, 7);
        addEdge(graph, 3, 5, 2);
        addEdge(graph, 5, 6, 3);
        
    


        dijkstra(graph,  0);
    }
}