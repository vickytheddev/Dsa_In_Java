import java.util.*;
public class segregate0and1 {
  public static void segregate(int[] arr) {
    int i=0,j=arr.length-1;
    while(i<j){
      if(arr[i]==0){
        i++;
      }
      else if(arr[j]==1){
        j--;
      }
      else if(arr[i]==1 && arr[j]==0){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1 };
    segregate(arr);
    System.out.println("After Segregation:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}