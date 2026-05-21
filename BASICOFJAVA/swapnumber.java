
import java.util.*;
public class swapnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After changing the values of a:"+a+" b:"+b);
    }
}
