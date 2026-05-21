
import java.util.*;
public class largestvalue {
    public static int getlarger(int [] number) {
        int large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < number.length; i++) {
            if(large < number[i]){
                large = number[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int [] number = {2,5,3,6,5};
        System.out.println(getlarger(number));
    }
}
