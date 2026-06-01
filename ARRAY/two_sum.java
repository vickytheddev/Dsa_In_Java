import java.util.*;
public class two_sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the targeted value: ");
    int n = sc.nextInt();
    int[] arr = { 1, 4, 7, 3, 2, 9, 7, 0 };
    int flag = 0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==n){
          flag=1;
          break;
        }
      }
    }
    if(flag==1){
      System.out.println("Target sum is found.");
    }else{
      System.out.println("target sum is not found.");
    }
  }
}
