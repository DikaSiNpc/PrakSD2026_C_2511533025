package Pekan7_2511533025;

public class SelectionSort_2511533025 {
	public static void selectionSort(int[] arr) {
		int n_3025 = arr.length;
		for (int i_3025 = 0; i_3025 < n_3025; i_3025++) {
			int minIndex_3025 = i_3025;
			for (int j_3025 = i_3025 + 1; j_3025 < n_3025; j_3025++) {
				if (arr[j_3025] < arr[minIndex_3025]) {
				minIndex_3025 = j_3025;
		    	}
			}
			int temp_3025 = arr[i_3025];
			arr[i_3025] = arr[minIndex_3025];
			arr[minIndex_3025] = temp_3025;
		}
	}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1 };
		int n_3025 = arr.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3025 = 0; i_3025 < n_3025; i_3025++)
			System.out.print(arr[i_3025] + " ");
		System.out.println("");
		selectionSort(arr);
		System.out.printf("array yang terurut:\n");
		for (int i_3025 = 0; i_3025 < n_3025; i_3025++)
			System.out.print(arr[i_3025] + " ");
		System.out.println("");
	}
}