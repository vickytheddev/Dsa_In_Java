import java.util.*;
public class weavy_array {
  public static void convert_to_weave(int[] arr){
    for(int i=0;i<arr.length;i+=2){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,3,5,6,7,5,8,4,2,3,9,10};
    Arrays.sort(arr);
    System.out.println("sorted array is:");
     for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }

    convert_to_weave(arr);

    System.out.println("after apply weave function:");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
