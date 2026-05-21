
import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("i="+i);
        }
    }
}
