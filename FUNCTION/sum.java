
import java.util.*;
public class sum {
    public static int summation(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Sum is "+summation(a,b));
    }
}
