
import java.util.*;
public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Prime number");
        }
        else{
            int flag =1;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime number");
            }
            else {
                System.out.println("Not prime number");
            }
        }
    }
}
