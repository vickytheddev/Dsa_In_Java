
import java.util.*;
public class break_statement {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n%2==0){
                break;
            }
            System.out.println(n);
        }
        while (true);
    }
}
