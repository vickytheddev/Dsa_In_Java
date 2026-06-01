import java.util.*;
public class merge_2_sorted_array {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] merge = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length) {

            if(a[i] < b[j]) {
                merge[k] = a[i];
                i++;
            } else {
                merge[k] = b[j];
                j++;
            }

            k++;
        }

        // remaining elements of a
        while(i < a.length) {
            merge[k] = a[i];
            i++;
            k++;
        }

        // remaining elements of b
        while(j < b.length) {
            merge[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(merge));
    }
}
