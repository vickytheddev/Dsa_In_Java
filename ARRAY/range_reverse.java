import java.util.*;
public class range_reverse {

  public static void main(String[] args) {
    int[] arr={3,4,5,2,1,6,7,9,8,0};
    int i=3,j=7;
    while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
    for(int element : arr){
      System.out.println(element);
    }
  }
}
