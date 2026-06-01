import java.util.*;
public class modify_odd_even_index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter the value of index "+ i + ": ");
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        arr[i]+=10;
      }
      else{
        arr[i]*=2;
      }
      System.out.println(arr[i]);
    }
  }
}
