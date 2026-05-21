
import java.util.*;
public class continue_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}
