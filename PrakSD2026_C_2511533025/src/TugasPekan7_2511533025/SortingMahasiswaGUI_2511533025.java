package TugasPekan7_2511533025;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class SortingMahasiswaGUI_2511533025 extends JFrame {
	
    private JTextField tfNama_3025, tfNim_3025, tfProdi_3025;
    private JButton btnTambah_3025, btnSorting_3025, btnReset_3025;
    private JComboBox<String> cbSorting_3025;
    private JTextArea areaProses_3025;
    private JTable table_3025;
    private DefaultTableModel model_3025;
    private ArrayList<Mahasiswa_2511533025> data_3025 = new ArrayList<>();
    private ArrayList<Mahasiswa_2511533025> backupData_3025 = new ArrayList<>();

    public SortingMahasiswaGUI_2511533025() {
        setTitle("Sorting Mahasiswa");
        setSize(800, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // =====================================
        // PANEL INPUT
        // =====================================

        JPanel panelInput_3025 = new JPanel(new GridLayout(4, 2, 5, 5));

        panelInput_3025.add(new JLabel("Nama Mahasiswa"));
        tfNama_3025 = new JTextField();
        panelInput_3025.add(tfNama_3025);

        panelInput_3025.add(new JLabel("NIM"));
        tfNim_3025 = new JTextField();
        panelInput_3025.add(tfNim_3025);

        panelInput_3025.add(new JLabel("Program Studi"));
        tfProdi_3025 = new JTextField();
        panelInput_3025.add(tfProdi_3025);

        btnTambah_3025 = new JButton("Tambah Data");
        panelInput_3025.add(btnTambah_3025);

        cbSorting_3025 = new JComboBox<>(new String[]{
                "Insertion Sort",
                "Selection Sort",
                "Bubble Sort"
        });
        panelInput_3025.add(cbSorting_3025);
        add(panelInput_3025, BorderLayout.NORTH);

        // =====================================
        // TABEL
        // =====================================

        model_3025 = new DefaultTableModel();
        model_3025.addColumn("Nama");
        model_3025.addColumn("NIM");
        model_3025.addColumn("Program Studi");
        table_3025 = new JTable(model_3025);

        JScrollPane scrollTable_3025 = new JScrollPane(table_3025);
        add(scrollTable_3025, BorderLayout.CENTER);

        // =====================================
        // AREA PROSES SORTING
        // =====================================

        areaProses_3025 = new JTextArea();
        areaProses_3025.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scrollArea_3025 = new JScrollPane(areaProses_3025);

        // =====================================
        // BUTTON
        // =====================================

        btnSorting_3025 = new JButton("Mulai Sorting");
        btnReset_3025 = new JButton("Reset");

        JPanel panelButton_3025 = new JPanel();
        panelButton_3025.add(btnSorting_3025);
        panelButton_3025.add(btnReset_3025);

        JPanel panelBawah_3025 = new JPanel(new BorderLayout());
        panelBawah_3025.add(panelButton_3025, BorderLayout.NORTH);
        panelBawah_3025.add(scrollArea_3025, BorderLayout.CENTER);
        add(panelBawah_3025, BorderLayout.SOUTH);

        // =====================================
        // EVENT TAMBAH DATA
        // =====================================

        btnTambah_3025.addActionListener(e -> tambahData());

        // =====================================
        // EVENT SORTING
        // =====================================

        btnSorting_3025.addActionListener(e -> prosesSorting());

        // =====================================
        // EVENT RESET
        // =====================================

        btnReset_3025.addActionListener(e -> resetData());
    }
    // =====================================
    // METHOD TAMBAH DATA
    // =====================================

    private void tambahData() {

        String nama_3025 = tfNama_3025.getText();
        String nim_3025 = tfNim_3025.getText();
        String prodi_3025 = tfProdi_3025.getText();
        if (nama_3025.isEmpty() || nim_3025.isEmpty() || prodi_3025.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Semua data harus diisi!"
            );
            return;
        }
        Mahasiswa_2511533025 mhs_3025 = new Mahasiswa_2511533025(nama_3025, nim_3025, prodi_3025);
        data_3025.add(mhs_3025);
        model_3025.addRow(new Object[]{
                nama_3025,
                nim_3025,
                prodi_3025
        });
        tfNama_3025.setText("");
        tfNim_3025.setText("");
        tfProdi_3025.setText("");
    }

    // =====================================
    // METHOD SORTING
    // =====================================

    private void prosesSorting() {

        areaProses_3025.setText("");
        backupData_3025.clear();
        for (Mahasiswa_2511533025 m_3025 : data_3025) {
            backupData_3025.add(
                    new Mahasiswa_2511533025(
                            m_3025.getNama(),
                            m_3025.getNim(),
                            m_3025.getProdi()
                    )
            );
        }
        String pilihan_3025 = cbSorting_3025.getSelectedItem().toString();
        if (pilihan_3025.equals("Insertion Sort")) {
            insertionSort();
        } else if (pilihan_3025.equals("Selection Sort")) {
            selectionSort();
        } else {
            bubbleSort();
        }
        refreshTable();
    }

    // =====================================
    // INSERTION SORT
    // =====================================

    private void insertionSort() {

        areaProses_3025.append("=== INSERTION SORT ===\n\n");
        for (int i_3025 = 1; i_3025 < data_3025.size(); i_3025++) {
            Mahasiswa_2511533025 key_3025 = data_3025.get(i_3025);
            int j_3025 = i_3025 - 1;
            while (j_3025 >= 0 &&
                    data_3025.get(j_3025).getNama()
                            .compareToIgnoreCase(key_3025.getNama()) > 0) {
                data_3025.set(j_3025 + 1, data_3025.get(j_3025));
                j_3025--;
            }
            data_3025.set(j_3025 + 1, key_3025);
            tampilkanLangkah(i_3025);
        }
    }

    // =====================================
    // SELECTION SORT
    // =====================================

    private void selectionSort() {

        areaProses_3025.append("=== SELECTION SORT ===\n\n");
        for (int i_3025 = 0; i_3025 < data_3025.size() - 1; i_3025++) {
            int min_3025 = i_3025;
            for (int j_3025 = i_3025 + 1; j_3025 < data_3025.size(); j_3025++) {
                if (data_3025.get(j_3025).getNama()
                        .compareToIgnoreCase(
                                data_3025.get(min_3025).getNama()) < 0) {
                    min_3025 = j_3025;
                }
            }
            Mahasiswa_2511533025 temp_3025 = data_3025.get(i_3025);
            data_3025.set(i_3025, data_3025.get(min_3025));
            data_3025.set(min_3025, temp_3025);
            tampilkanLangkah(i_3025 + 1);
        }
    }

    // =====================================
    // BUBBLE SORT
    // =====================================

    private void bubbleSort() {

        areaProses_3025.append("=== BUBBLE SORT ===\n\n");
        for (int i_3025 = 0; i_3025 < data_3025.size() - 1; i_3025++) {
            for (int j_3025 = 0; j_3025 < data_3025.size() - i_3025 - 1; j_3025++) {
                if (data_3025.get(j_3025).getNama()
                        .compareToIgnoreCase(
                                data_3025.get(j_3025 + 1).getNama()) > 0) {
                    Mahasiswa_2511533025 temp_3025 = data_3025.get(j_3025);
                    data_3025.set(j_3025, data_3025.get(j_3025 + 1));
                    data_3025.set(j_3025 + 1, temp_3025);
                }
            }
            tampilkanLangkah(i_3025 + 1);
        }
    }

    // =====================================
    // MENAMPILKAN LANGKAH
    // =====================================

    private void tampilkanLangkah(int langkah) {

        areaProses_3025.append("Langkah " + langkah + " : ");
        for (Mahasiswa_2511533025 m_3025 : data_3025) {
            areaProses_3025.append(m_3025.getNama() + " ");
        }
        areaProses_3025.append("\n");
    }

    // =====================================
    // REFRESH TABEL
    // =====================================

    private void refreshTable() {

        model_3025.setRowCount(0);
        for (Mahasiswa_2511533025 m_3025 : data_3025) {
            model_3025.addRow(new Object[]{
                    m_3025.getNama(),
                    m_3025.getNim(),
                    m_3025.getProdi()
            });
        }
    }

    // =====================================
    // RESET DATA DAN JSCROLLPANE
    // =====================================

    private void resetData() {

        // KEMBALIKAN DATA AWAL
        data_3025.clear();
        for (Mahasiswa_2511533025 m_3025 : backupData_3025) {
            data_3025.add(
                    new Mahasiswa_2511533025(
                            m_3025.getNama(),
                            m_3025.getNim(),
                            m_3025.getProdi()
                    )
            );
        }
        refreshTable();
        // BERSIHKAN TEXT AREA PADA JSCROLLPANE
        areaProses_3025.setText("");
    }

    // =====================================
    // MAIN
    // =====================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new SortingMahasiswaGUI_2511533025().setVisible(true);
        });
    }
}