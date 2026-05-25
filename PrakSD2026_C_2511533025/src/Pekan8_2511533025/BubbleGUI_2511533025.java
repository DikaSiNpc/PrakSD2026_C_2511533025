package Pekan8_2511533025;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Pekan7_2511533025.InsertionGUI_2511533025;

public class BubbleGUI_2511533025 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3025;
	private JLabel[] labelArray_3025;
	private JButton stepButton_3025, resetButton_3025, setButton_3025;
	private JTextField inputField_3025;
	private JPanel panelArray_3025;
	private JTextArea stepArea_3025;
	
	private int i_3025 = 1, j_3025;
	private boolean sorting_3025 = false;
	private int stepCount_3025 = 1;
	

	/**
	 * Create the frame.
	 */
	public BubbleGUI_2511533025() {
	    setTitle("Bubble Sort Langkah per Langkah");
	    setSize(772, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_3025 = new JPanel(new FlowLayout());
	    inputField_3025 = new JTextField(30);
	    setButton_3025 = new JButton("Set Array");
	    inputPanel_3025.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_3025.add(inputField_3025);
	    inputPanel_3025.add(setButton_3025);

	    // Panel array visual
	    panelArray_3025 = new JPanel();
	    panelArray_3025.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_3025 = new JPanel();
	    stepButton_3025 = new JButton("Langkah Selanjutnya");
	    resetButton_3025 = new JButton("Reset");
	    stepButton_3025.setEnabled(false);
	    controlPanel_3025.add(stepButton_3025);
	    controlPanel_3025.add(resetButton_3025);
	    // Area teks untuk log langkah-langkah
	    stepArea_3025 = new JTextArea(8, 60);
	    stepArea_3025.setEditable(false);
	    stepArea_3025.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_3025 = new JScrollPane(stepArea_3025);

	    // Tambahkan panel ke frame
	    add(inputPanel_3025, BorderLayout.NORTH);
	    add(panelArray_3025, BorderLayout.CENTER);
	    add(controlPanel_3025, BorderLayout.SOUTH);
	    add(scrollPane_3025, BorderLayout.EAST);

	    // Event Set Array
	    setButton_3025.addActionListener(e -> setArrayFromInput());

	    // Event Langkah Selanjutnya
	    stepButton_3025.addActionListener(e -> performStep());

	    // Event Reset
	    resetButton_3025.addActionListener(e -> reset());
	}
	private void setArrayFromInput() {
	    String text_3025 = inputField_3025.getText().trim();
	    if (text_3025.isEmpty()) return;
	    String[] parts_3025 = text_3025.split(",");
	    array_3025 = new int[parts_3025.length];
	    try {
	        for (int k_3025 = 0; k_3025 < parts_3025.length; k_3025++) {
	            array_3025[k_3025] = Integer.parseInt(parts_3025[k_3025].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
	                + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    i_3025 = 0;
	    j_3025 = 0;
	    stepCount_3025 = 1;
	    sorting_3025 = true;
	    stepButton_3025.setEnabled(true);
	    stepArea_3025.setText("");
	    panelArray_3025.removeAll();
	    labelArray_3025 = new JLabel[array_3025.length];
	    for (int k_3025 = 0; k_3025 < array_3025.length; k_3025++) {
	        labelArray_3025[k_3025] = new JLabel(String.valueOf(array_3025[k_3025]));
	        labelArray_3025[k_3025].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_3025[k_3025].setOpaque(true);
	        labelArray_3025[k_3025].setBackground(Color.WHITE);
	        labelArray_3025[k_3025].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_3025[k_3025].setPreferredSize(new Dimension(50, 50));
	        labelArray_3025[k_3025].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_3025.add(labelArray_3025[k_3025]);
	    }

	    panelArray_3025.revalidate();
	    panelArray_3025.repaint();
	}
	private void performStep() {
	    if (!sorting_3025 || i_3025 >= array_3025.length - 1) {
	        sorting_3025 = false;
	        stepButton_3025.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }
	    resetHighlights();
	    StringBuilder stepLog_3025 = new StringBuilder();
	    labelArray_3025[j_3025].setBackground(Color.CYAN);
	    labelArray_3025[j_3025 + 1].setBackground(Color.CYAN);
	    if (array_3025[j_3025] > array_3025[j_3025 + 1]) {
	        // Swap
	        int temp_3025 = array_3025[j_3025];
	        array_3025[j_3025] = array_3025[j_3025 + 1];
	        array_3025[j_3025 + 1] = temp_3025;
	        labelArray_3025[j_3025].setBackground(Color.RED);
	        labelArray_3025[j_3025 + 1].setBackground(Color.RED);
	        stepLog_3025.append("Langkah ").append(stepCount_3025).append(": Menukar elemen ke-")
	                .append(j_3025).append(" (").append(array_3025[j_3025 + 1]).append(") dengan ke-")
	                .append(j_3025 + 1).append(" (").append(array_3025[j_3025]).append(")\n");
	    } else {
	        stepLog_3025.append("Langkah ").append(stepCount_3025).append(": Tidak ada pertukaran antara ke-")
	                .append(j_3025).append(" dan ke-").append(j_3025 + 1).append("\n");
	    }
	    stepLog_3025.append("Hasil: ").append(arrayToString(array_3025)).append("\n\n");
	    stepArea_3025.append(stepLog_3025.toString());
	    updateLabels();
	    j_3025++;
	    if (j_3025 >= array_3025.length - i_3025 - 1) {
	        j_3025 = 0;
	        i_3025++;
	    }
	    stepCount_3025++;
	    if (i_3025 >= array_3025.length - 1) {
	        sorting_3025 = false;
	        stepButton_3025.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }
	}
	private void updateLabels() {
	    for (int k_3025 = 0; k_3025 < array_3025.length; k_3025++) {
	        labelArray_3025[k_3025].setText(String.valueOf(array_3025[k_3025]));
	    }
	}

	private void resetHighlights() {
	    for (JLabel label_3025 : labelArray_3025) {
	        label_3025.setBackground(Color.WHITE);
	    }
	}

	private void reset() {
	    inputField_3025.setText("");
	    panelArray_3025.removeAll();
	    panelArray_3025.revalidate();
	    panelArray_3025.repaint();
	    stepArea_3025.setText("");
	    stepButton_3025.setEnabled(false);
	    sorting_3025 = false;
	    i_3025 = 0;
	    j_3025 = 0;
	    stepCount_3025 = 1;
	}

	private String arrayToString(int[] arr_3025) {
	    StringBuilder sb_3025 = new StringBuilder();
	    for (int k_3025 = 0; k_3025 < arr_3025.length; k_3025++) {
	        sb_3025.append(arr_3025[k_3025]);
	        if (k_3025 < arr_3025.length - 1) sb_3025.append(", ");
	    }
	    return sb_3025.toString();
	}
	public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
    		BubbleGUI_2511533025 gui_3025 = new BubbleGUI_2511533025();
    		gui_3025.setVisible(true);
    	});
    }
}