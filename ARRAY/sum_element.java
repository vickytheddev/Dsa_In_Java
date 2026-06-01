import java.util.Scanner;

public class sum_element {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter the value of index "+ i + ": ");
      arr[i] = sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    System.out.println("sum of array element is: "+sum);
  }
}
