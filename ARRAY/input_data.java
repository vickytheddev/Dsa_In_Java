import java.util.*;
public class input_data {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter the value of index "+ i + ": ");
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
