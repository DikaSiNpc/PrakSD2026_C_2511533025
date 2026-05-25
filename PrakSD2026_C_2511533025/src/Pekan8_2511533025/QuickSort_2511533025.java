package Pekan8_2511533025;
public class QuickSort_2511533025 {
    static void swap(int[] arr_3025, int i_3025, int j_3025)
    {
        int temp_3025 = arr_3025[i_3025];
        arr_3025[i_3025] = arr_3025[j_3025];
        arr_3025[j_3025] = temp_3025;
    }
    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
    static void medianOfThree(int[] arr_3025, int low_3025, int high_3025)
    {
        int mid_3025 = low_3025 + (high_3025 - low_3025) / 2;

        // Urutkan elemen low, mid, dan high
        if (arr_3025[low_3025] > arr_3025[mid_3025]) {
            swap(arr_3025, low_3025, mid_3025);
        }
        if (arr_3025[low_3025] > arr_3025[high_3025]) {
            swap(arr_3025, low_3025, high_3025);
        }
        if (arr_3025[mid_3025] > arr_3025[high_3025]) {
            swap(arr_3025, mid_3025, high_3025);
        }
        swap(arr_3025, mid_3025, high_3025);
    }
    static int partition(int[] arr_3025, int low_3025, int high_3025)
    {
        // Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree(arr_3025, low_3025, high_3025);

        int pivot = arr_3025[high_3025]; // Sekarang arr[high] sudah berisi nilai median
        int i_3025 = (low_3025 - 1);

        for (int j_3025 = low_3025; j_3025 <= high_3025 - 1; j_3025++) {
            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_3025[j_3025] < pivot) {
                // Increment indeks elemen yang lebih kecil
                i_3025++;
                swap(arr_3025, i_3025, j_3025);
            }
        }
        swap(arr_3025, i_3025 + 1, high_3025);
        return (i_3025 + 1);
    }
    static void quickSort(int[] arr_3025, int low_3025, int high_3025)
    {
        if (low_3025 < high_3025) {
            int pi_3025 = partition(arr_3025, low_3025, high_3025);
            quickSort(arr_3025, low_3025, pi_3025 - 1);
            quickSort(arr_3025, pi_3025 + 1, high_3025);
        }
    }
    public static void printArr(int[] arr_3025)
    {
        for (int i_3025 = 0; i_3025 < arr_3025.length; i_3025++) {
            System.out.print(arr_3025[i_3025] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr_3025 = { 10, 7, 8, 9, 1, 5 };
        int N_3025 = arr_3025.length;
        System.out.print("Data sebelum diurutkan: ");
        printArr(arr_3025);

        quickSort(arr_3025, 0, N_3025 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr(arr_3025);
    }
}