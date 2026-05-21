import java.util.Scanner;
public class printallsubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter string value: ");
        String str = sc.nextLine();
        System.err.println(str);
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}