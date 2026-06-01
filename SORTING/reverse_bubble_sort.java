import java.util.*;
public class reverse_bubble_sort {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 6, 1, 4, 5, 2, 9, 8, 10};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no swapping happens, array is already sorted
            if (!swapped) {
                break;
            }
        }
        display(arr);
    }
}


//time complexity 
// best case o(n)
// average case o(n^2)
// worst case o(n^2)