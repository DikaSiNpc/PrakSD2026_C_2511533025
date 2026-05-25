package Pekan8_2511533025;

public class ShellSort_2511533025 {
	public static void shellSort(int[] A_3025) {
		int n_3025 = A_3025.length;
		int gap_3025 = n_3025 / 2;
		while (gap_3025 > 0) {
			for (int i_3025 = gap_3025; i_3025 < n_3025; i_3025++) {
				int temp_3025 = A_3025[i_3025];
				int j_3025 = i_3025;
				while (j_3025 >= gap_3025 && A_3025[j_3025 - gap_3025] > temp_3025) {
					A_3025[j_3025] = A_3025[j_3025 - gap_3025];
					j_3025 = j_3025 - gap_3025;
				}
				A_3025[j_3025] = temp_3025;
			}
			gap_3025 = gap_3025 / 2;
		}
	}
	public static void main(String[] args) {
		int[] data_3025 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray(data_3025);
		shellSort(data_3025);
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_3025);
	}
	public static void printArray(int[] arr_3025) {
		for (int i_3025 : arr_3025) System.out.print(i_3025 + " ");
		System.out.println();
	}
}