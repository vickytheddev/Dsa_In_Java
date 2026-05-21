
import java.util.Scanner;

public class toggle{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter string value: ");
        StringBuffer str = new StringBuffer(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            boolean flag =true;
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci = (int)ch;
            if(asci>97){
                flag=false;
            }
            if(flag==true){
                asci=asci+32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
            else{
                asci=asci-32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}