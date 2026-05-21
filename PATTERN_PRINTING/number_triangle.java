import java.util.*;
public class number_triangle {
  public static void main(String[] args) {
    int n=5;
    int count=0;
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
        count++;
        System.out.print(count + " ");
      }
      System.out.println();
    }
  }
}

