
import java.util.*;
public class inputvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int [5];
        int i;
        for(i = 0; i < number.length; i++) {
            System.out.println("enter the value of index "+(i));
            number[i] = sc.nextInt();
        }
        System.out.println("marks after entering:");
        for(i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
