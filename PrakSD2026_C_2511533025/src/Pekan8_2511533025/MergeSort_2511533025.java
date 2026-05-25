package Pekan8_2511533025;
public class MergeSort_2511533025 {
    void merge(int arr[], int l_3025, int m_3025, int r_3025) {
        // Find sizes of two subarrays to be merged
        int n1_3025 = m_3025 - l_3025 + 1;
        int n2_3025 = r_3025 - m_3025;
        /* Create temp arrays */
        int L_3025[] = new int[n1_3025];
        int R_3025[] = new int[n2_3025];
        /* Copy data to temp arrays */
        for (int i_3025 = 0; i_3025 < n1_3025; ++i_3025)
            L_3025[i_3025] = arr[l_3025 + i_3025];
        for (int j_3025 = 0; j_3025 < n2_3025; ++j_3025)
            R_3025[j_3025] = arr[m_3025 + 1 + j_3025];
        int i_3025 = 0, j_3025 = 0;
        // Initial index of merged subarray array
        int k_3025 = l_3025;
        while (i_3025 < n1_3025 && j_3025 < n2_3025) {
            if (L_3025[i_3025] <= R_3025[j_3025]) {
                arr[k_3025] = L_3025[i_3025];
                i_3025++;
            } else {
                arr[k_3025] = R_3025[j_3025];
                j_3025++;
            }
            k_3025++;
        }
        /* Copy remaining elements of L[] if any */
        while (i_3025 < n1_3025) {
            arr[k_3025] = L_3025[i_3025];
            i_3025++;
            k_3025++;
        }
        /* Copy remaining elements of R[] if any */
        while (j_3025 < n2_3025) {
            arr[k_3025] = R_3025[j_3025];
            j_3025++;
            k_3025++;
        }
    }
    void sort(int arr_3025[], int l_3025, int r_3025) {
        if (l_3025 < r_3025) {
            // Find the middle point
            int m_3025 = (l_3025 + r_3025) / 2;
            // Sort first and second halves
            sort(arr_3025, l_3025, m_3025);
            sort(arr_3025, m_3025 + 1, r_3025);
            // Merge the sorted halves
            merge(arr_3025, l_3025, m_3025, r_3025);
        }
    }
    /* A utility function to print array of size n */
    static void printArray(int arr_3025[]) {
        int n_3025 = arr_3025.length;
        for (int i_3025 = 0; i_3025 < n_3025; ++i_3025)
            System.out.print(arr_3025[i_3025] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr_3025[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut");
        printArray(arr_3025);
        MergeSort_2511533025 ob_3025 = new MergeSort_2511533025();
        ob_3025.sort(arr_3025, 0, arr_3025.length - 1);
        System.out.println("\nSesudah Terurut menggunakan merge Sort");
        printArray(arr_3025);
    }
}