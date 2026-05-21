
import java.util.*;
public class switch_case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter + for summation\nEnter - for subtraction\nEnter * for multiplication\nEnter / for division\nEnter % for modulo");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        switch (ch) {
            case '+': System.out.println("Summation is " + (a+b));break;
            case '-': System.out.println("Subtraction is " + (a-b));break;
            case '*': System.out.println("Multiplication is " + a*b);break;
            case '/': System.out.println("Division is " + a/b);break;
            case '%': System.out.println("Modulo is " + a%b);break;
        }
    }
}
