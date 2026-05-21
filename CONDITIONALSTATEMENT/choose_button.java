
import java.util.*;
public class choose_button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number == 1) {
            System.out.println("Good Morning");
        }
        else if(number == 2) {
            System.out.println("Good Afternoon");
        }
        else if(number == 3) {
            System.out.println("Good Evening");
        }
        else if(number == 4) {
            System.out.println("Good Night");
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
