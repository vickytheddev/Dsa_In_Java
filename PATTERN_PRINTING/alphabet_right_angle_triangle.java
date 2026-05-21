import java.util.*;
public class alphabet_right_angle_triangle{
  public static void main(String[] args) {
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
        int a=col;
        int b=64;
        int c=a+b;
        char ans=(char)c;
        System.out.print(ans+" ");
      }
      System.out.println();
    }
  }
}

