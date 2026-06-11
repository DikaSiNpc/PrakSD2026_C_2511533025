package TugasPekan9_2511533025;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SchoolBFSDFS_2511533025 extends JFrame {
    private JComboBox<String> cbAwal_3025, cbTujuan_3025;
    private JTextArea hasilArea_3025;
    private JTextArea graphArea_3025;
    private Graph graph_3025;
    public SchoolBFSDFS_2511533025() {

        graph_3025 = new Graph();
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(1100, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // ================= HEADER =================

        JPanel header_3025 = new JPanel();
        header_3025.setBackground(new Color(0, 51, 102));
        header_3025.setPreferredSize(new Dimension(1000, 70));

        JLabel title_3025 = new JLabel(
                "PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");

        title_3025.setForeground(Color.WHITE);
        title_3025.setFont(new Font("Arial", Font.BOLD, 28));
        header_3025.add(title_3025);
        getContentPane().add(header_3025, BorderLayout.NORTH);

        // ================= PANEL UTAMA =================

        JPanel mainPanel_3025 = new JPanel();
        mainPanel_3025.setLayout(null);

        // Lokasi Awal

        JLabel lblAwal_3025 = new JLabel("Lokasi Awal");
        lblAwal_3025.setBounds(30, 20, 150, 30);
        JLabel titik1_3025 = new JLabel(":");
        titik1_3025.setBounds(150, 20, 20, 30);

        cbAwal_3025 = new JComboBox<>(graph_3025.getNodes());
        cbAwal_3025.setModel(new DefaultComboBoxModel(new String[] {"Balai Desa", "Lapangan Sepak Bola", "Perpustakaan", "Peron Sawit", "Kantin", "Parkiran", "Rumahku", "Mushola", "Sekolah", "Puskesmas"}));
        cbAwal_3025.setBounds(180, 20, 180, 30);

        // Lokasi Tujuan

        JLabel lblTujuan_3025 = new JLabel("Lokasi Tujuan");
        lblTujuan_3025.setBounds(30, 60, 150, 30);
        JLabel titik2_3025 = new JLabel(":");
        titik2_3025.setBounds(150, 60, 20, 30);

        cbTujuan_3025 = new JComboBox<>(graph_3025.getNodes());
        cbTujuan_3025.setModel(new DefaultComboBoxModel(new String[] {"Balai Desa", "Lapangan Sepak Bola", "Perpustakaan", "Peron Sawit", "Kantin", "Parkiran", "Rumahku", "Mushola", "Sekolah", "Puskesmas"}));
        cbTujuan_3025.setBounds(180, 60, 180, 30);

        // Tombol

        JButton btnBFS_3025 = new JButton("BFS");
        btnBFS_3025.setBounds(700, 20, 120, 40);
        btnBFS_3025.setBackground(new Color(102, 255, 102));

        JButton btnDFS_3025 = new JButton("DFS");
        btnDFS_3025.setBounds(840, 20, 120, 40);
        btnDFS_3025.setBackground(new Color(255, 204, 0));

        JButton btnReset_3025 = new JButton("RESET");
        btnReset_3025.setBounds(980, 20, 120, 40);
        btnReset_3025.setBackground(new Color(255, 102, 102));

        // ================= GRAPH =================

        graphArea_3025 = new JTextArea();
        graphArea_3025.setEditable(false);
        graphArea_3025.setFont(
                new Font("Monospaced",
                        Font.BOLD,
                        20));

        graphArea_3025.setText(

                "\n" +
                "            Rumahku\n" +
                "               |\n" +
                "       ------- Lapangan Sepak Bola\n" +
                "      |                 |\n" +
                "Perpustakaan ------- Sekolah ------- Kantin\n" +
                "      |      |---------|||---| |------| |\n" +
                " Balai Desa--|       Mushola  -|--- Peron Sawit\n" +
                "      |                 |   |--|        |\n" +
                " Puskesmas --------- Parkiran ----------\n"
                
        );
        JScrollPane graphScroll_3025 =
                new JScrollPane(graphArea_3025);
        graphScroll_3025.setBorder(
                BorderFactory.createTitledBorder(
                        "VISUALISASI GRAPH"));
        graphScroll_3025.setBounds(30, 120, 1040, 300);

        // ================= HASIL =================

        hasilArea_3025 = new JTextArea();
        hasilArea_3025.setFont(
                new Font("Monospaced",
                        Font.BOLD,
                        18));
        hasilArea_3025.setEditable(false);
        hasilArea_3025.setText(
                "Hasil Pencarian :\n" +
                "Jalur :\n" +
                "Node Dikunjungi :\n" +
                "Jumlah Node Dikunjungi : 0");

        JScrollPane hasilScroll_3025 =
                new JScrollPane(hasilArea_3025);

        hasilScroll_3025.setBounds(
                30,
                450,
                1040,
                180);

        mainPanel_3025.add(lblAwal_3025);
        mainPanel_3025.add(titik1_3025);
        mainPanel_3025.add(cbAwal_3025);

        mainPanel_3025.add(lblTujuan_3025);
        mainPanel_3025.add(titik2_3025);
        mainPanel_3025.add(cbTujuan_3025);

        mainPanel_3025.add(btnBFS_3025);
        mainPanel_3025.add(btnDFS_3025);
        mainPanel_3025.add(btnReset_3025);

        mainPanel_3025.add(graphScroll_3025);
        mainPanel_3025.add(hasilScroll_3025);

        getContentPane().add(mainPanel_3025, BorderLayout.CENTER);

        // ================= EVENT BFS =================

        btnBFS_3025.addActionListener(e -> {
            String start_3025 =
                    cbAwal_3025.getSelectedItem().toString();
            String goal_3025 =
                    cbTujuan_3025.getSelectedItem().toString();
            SearchResult result_3025 =
                    graph_3025.BFS(start_3025, goal_3025);
            tampilkanHasil("BFS", result_3025);
        });

        // ================= EVENT DFS =================

        btnDFS_3025.addActionListener(e -> {
            String start_3025 =
                    cbAwal_3025.getSelectedItem().toString();
            String goal_3025 =
                    cbTujuan_3025.getSelectedItem().toString();
            SearchResult result_3025 =
                    graph_3025.DFS(start_3025, goal_3025);
            tampilkanHasil("DFS", result_3025);
        });

        // ================= RESET =================

        btnReset_3025.addActionListener(e -> {

            hasilArea_3025.setText(
                    "Hasil Pencarian :\n" +
                    "Jalur :\n" +
                    "Node Dikunjungi :\n" +
                    "Jumlah Node Dikunjungi : 0");
        });
    }
    private void tampilkanHasil(
            String metode_3025,
            SearchResult result_3025) {

        hasilArea_3025.setText(

                "Metode : " + metode_3025 + "\n\n" +

                "Jalur :\n" +

                String.join(" -> ",
                        result_3025.path_3025)

                +

                "\n\nNode Dikunjungi :\n"

                +

                String.join(" -> ",
                        result_3025.visited_3025)

                +

                "\n\nJumlah Node Dikunjungi : "

                +

                result_3025.visited_3025.size()

        );
    }

    // =====================================================
    // SEARCH RESULT
    // =====================================================

    static class SearchResult {
        java.util.List<String> path_3025;
        java.util.List<String> visited_3025;
        SearchResult(
                java.util.List<String> path_3025,
                java.util.List<String> visited_3025) {
            this.path_3025 = path_3025;
            this.visited_3025 = visited_3025;
        }
    }

    // =====================================================
    // GRAPH
    // =====================================================

    static class Graph {
        private Map<String,
                java.util.List<String>> adj =
                new HashMap<>();

        Graph() {
            addEdge("Sekolah",
                    "Lapangan Sepak Bola");

            addEdge("Sekolah",
                    "Mushola");

            addEdge("Sekolah",
                    "Balai Desa");

            addEdge("Sekolah",
                    "Peron Sawit");

            addEdge("Sekolah",
                    "Kantin");

            addEdge("Sekolah",
                    "Perpustakaan");

            addEdge("Lapangan Sepak Bola",
                    "Rumahku");

            addEdge("Perpustakaan",
                    "Balai Desa");

            addEdge("Balai Desa",
                    "Puskesmas");

            addEdge("Puskesmas",
                    "Parkiran");

            addEdge("Parkiran",
                    "Mushola");

            addEdge("Kantin",
                    "Peron Sawit");

            addEdge("Kantin",
                    "Parkiran");

            addEdge("Peron Sawit",
                    "Parkiran");

            addEdge("Lapangan Sepak Bola",
                    "Perpustakaan");
        }
        void addEdge(String a_3025, String b_3025) {
            adj.computeIfAbsent(
                    a_3025,
                    k_3025 -> new ArrayList<>()).add(b_3025);

            adj.computeIfAbsent(
                    b_3025,
                    k_3025 -> new ArrayList<>()).add(a_3025);
        }
        String[] getNodes() {
            return adj.keySet()
                    .toArray(new String[0]);
        }
        SearchResult BFS(
                String start_3025,
                String goal_3025) {
            Queue<String> queue_3025 =
                    new LinkedList<>();
            LinkedHashSet<String> visited_3025 =
                    new LinkedHashSet<>();
            Map<String, String> parent_3025 =
                    new HashMap<>();

            queue_3025.add(start_3025);
            visited_3025.add(start_3025);
            while (!queue_3025.isEmpty()) {
                String current_3025 =
                        queue_3025.poll();

                if (current_3025.equals(goal_3025))
                    break;
                for (String next_3025 :
                        adj.get(current_3025)) {
                    if (!visited_3025.contains(next_3025)) {
                        visited_3025.add(next_3025);
                        parent_3025.put(next_3025,
                                current_3025);
                        queue_3025.add(next_3025);
                    }
                }
            }
            return buildResult(
                    goal_3025,
                    parent_3025,
                    visited_3025);
        }
        SearchResult DFS(
                String start_3025,
                String goal_3025) {
            Stack<String> stack_3025 =
                    new Stack<>();
            LinkedHashSet<String> visited_3025 =
                    new LinkedHashSet<>();

            Map<String, String> parent_3025 =
                    new HashMap<>();
            stack_3025.push(start_3025);

            while (!stack_3025.isEmpty()) {
                String current_3025 =
                        stack_3025.pop();
                if (visited_3025.contains(current_3025))
                    continue;
                visited_3025.add(current_3025);
                if (current_3025.equals(goal_3025))
                    break;
                for (String next_3025 :
                        adj.get(current_3025)) {
                    if (!visited_3025.contains(next_3025)) {
                        parent_3025.put(next_3025,
                                current_3025);
                        stack_3025.push(next_3025);
                    }
                }
            }
            return buildResult(
                    goal_3025,
                    parent_3025,
                    visited_3025);
        }
        SearchResult buildResult(
                String goal_3025,
                Map<String, String> parent_3025,
                Set<String> visited_3025) {

            java.util.List<String> path_3025 =
                    new ArrayList<>();
            String current_3025 = goal_3025;
            path_3025.add(current_3025);

            while (parent_3025.containsKey(current_3025)) {
                current_3025 =
                        parent_3025.get(current_3025);
                path_3025.add(current_3025);
            }
            Collections.reverse(path_3025);
            return new SearchResult(
                    path_3025,
                    new ArrayList<>(visited_3025));
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SchoolBFSDFS_2511533025()
                    .setVisible(true);

        });
    }
}