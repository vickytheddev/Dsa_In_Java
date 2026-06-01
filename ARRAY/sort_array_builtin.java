import java.util.*;
public class sort_array_builtin {
  public static void main(String[] args) {
    int[] arr = {3,6,-2,0,3,2,-9};
    print(arr);
    Arrays.sort(arr);
    System.out.println();
    print(arr);
  }
  public static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
