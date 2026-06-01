import java.util.*;
public class move_all_zero_to_end {
    public static void moveZeroes(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 1, 2, 0, 5};
        moveZeroes(arr);
        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}