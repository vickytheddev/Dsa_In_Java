import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        /*for(int i=1;i<=2*n-1;i+=2){  using find nth term
           System.out.print(i+" ");
        }*/

       int a=3,d=4;  //using increment
       for(int i=1;i<=n;i++){
        System.out.print(a+" ");
        a+=d;
       }
    }
}
