import java.util.*;
public class permutationandCombination {

  public static int factorial (int x){
      int f=1;
      for(int i=1;i<=x;i++){
        f=f*i;
      }
      return f;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n =sc.nextInt();
    System.out.println("Enter the value of r: ");
    int r =sc.nextInt();
    int ncr=factorial(n)/(factorial(r)*factorial(n-r));
    int npr=factorial(n)/(factorial(n-r));
    System.out.println("combination value is: " + ncr);
    System.out.println("permutation value is: " + npr);
  }
}
