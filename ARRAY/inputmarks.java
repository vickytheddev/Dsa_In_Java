
import java.util.*;
public class inputmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        for(int i =0 ; i < marks.length ; i++){
            System.out.println("Enter the marks " + (i+1));
            marks[i] = sc.nextInt();
        }
        System.out.println("Maths marks is " + marks[0]);
        System.out.println("English marks is " + marks[1]);
        System.out.println("Science marks is " + marks[2]);
    }
}
