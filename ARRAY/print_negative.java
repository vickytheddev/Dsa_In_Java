import java.util.*;
public class print_negative {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[5];
    for(int i=0;i<5;i++){
      System.out.print("Enter the value of index "+ i + ": ");
      arr[i] = sc.nextInt();
    }
     for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                arr[i] = -arr[i];
            }

            System.out.println(arr[i]);
        }
  }
}
