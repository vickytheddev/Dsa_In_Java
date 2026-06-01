import java.util.*;

public class search_in_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value that you want to search: ");
    int s = sc.nextInt();
    int[] arr = { 1, 4, 7, 3, 2, 9, 7, 0 };
    int flag = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == s) {
        flag = 1;
        break;
      }
    }
    if (flag==1) {
      System.out.println("Element is found.");
    } else {
      System.out.println("Element is not found.");
    }
  }
}
