
import java.util.*;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=num);
    }
}
