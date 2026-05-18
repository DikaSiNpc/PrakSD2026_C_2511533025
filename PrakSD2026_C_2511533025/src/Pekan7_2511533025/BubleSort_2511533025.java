package Pekan7_2511533025;
public class BubleSort_2511533025 {
    public static void bubbleSort(int[] arr) {
        int n_3025 = arr.length;
        // Perbaikan: pada gambar tertulis '1 < n', seharusnya 'i < n'
        for (int i_3025 = 0; i_3025 < n_3025; i_3025++) {
            for (int j_3025 = 0; j_3025 < n_3025 - i_3025 - 1; j_3025++) {
                if (arr[j_3025] > arr[j_3025 + 1]) {
                    int temp_3025 = arr[j_3025];
                    arr[j_3025] = arr[j_3025 + 1];
                    arr[j_3025 + 1] = temp_3025;
                    
                    // System.out.println("data:"+arr[j]+" "+arr[j+1]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
        int n_3025 = arr.length;
        System.out.print("array yang belum terurut:");
        for (int i_3025 = 0; i_3025 < n_3025; i_3025++)
            System.out.print(arr[i_3025] + " ");
        System.out.println("");
        //minMaxSelectionSort(arr, n);
        bubbleSort(arr);
        System.out.print("array yang terurut menggunakan BubleSort:");
        for (int i_3025 = 0; i_3025 < n_3025; i_3025++)
            System.out.print(arr[i_3025] + " ");
        System.out.println("");
    }
}