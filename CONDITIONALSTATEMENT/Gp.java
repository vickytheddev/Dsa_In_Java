import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number ");
        int n=sc.nextInt();
        int a=3,r=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
