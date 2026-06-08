package Pekan9_2511533025;
import java.util.*;

public class GraphTraversal_2511533025 {
    private Map<String, List<String>> graph_3025 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_3025, String node2_3025) {
        graph_3025.putIfAbsent(node1_3025, new ArrayList<>());
        graph_3025.putIfAbsent(node2_3025, new ArrayList<>());
        graph_3025.get(node1_3025).add(node2_3025);
        graph_3025.get(node2_3025).add(node1_3025);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3025 : graph_3025.keySet()) {
            System.out.print(node_3025 + " -> ");
            List<String> neighbors_3025 = graph_3025.get(node_3025);
            System.out.println(String.join(", ", neighbors_3025));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs(String start_3025) {
        Set<String> visited_3025 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start_3025, visited_3025);
        System.out.println();
    }

    private void dfsHelper(String current_3025, Set<String> visited_3025) {
        if (visited_3025.contains(current_3025)) return;
        visited_3025.add(current_3025);
        System.out.print(current_3025 + " ");
        for (String neighbor_3025 : graph_3025.getOrDefault(current_3025, new ArrayList<>())) {
            dfsHelper(neighbor_3025, visited_3025);
        }
    }
        // BFS iteratif
        public void bfs(String start_3025) {
            Set<String> visited_3025 = new HashSet<>();
            Queue<String> queue_3025 = new LinkedList<>();
            queue_3025.add(start_3025);
            visited_3025.add(start_3025);
            System.out.println("Penelusuran BFS:");
            while (!queue_3025.isEmpty()) {
                String current_3025 = queue_3025.poll();
                System.out.print(current_3025 + " ");
                for (String neighbor_3025 : graph_3025.getOrDefault(current_3025, new ArrayList<>())) {
                    if (!visited_3025.contains(neighbor_3025)) {
                        queue_3025.add(neighbor_3025);
                        visited_3025.add(neighbor_3025);
                    }
                }
            }
            System.out.println();
        }

        // Main
        public static void main(String[] args) {
            GraphTraversal_2511533025 graph_3025 = new GraphTraversal_2511533025();

            // Contoh graf: A-B, A-C, B-D, B-E
            graph_3025.addEdge("A", "B");
            graph_3025.addEdge("A", "C");
            graph_3025.addEdge("B", "D");
            graph_3025.addEdge("B", "E");
            // Cetak graf awal
            System.out.println("Garf Awal adalah: ");
            graph_3025.printGraph();
            // Lakukan penelusuran
            graph_3025.dfs("A");
            graph_3025.bfs("A");
        }
    
  }