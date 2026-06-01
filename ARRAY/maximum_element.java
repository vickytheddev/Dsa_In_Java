import java.util.*;
public class maximum_element {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter the value of index "+ i + ": ");
      arr[i]=sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println("Maximum number is: "+max);
  }
}
