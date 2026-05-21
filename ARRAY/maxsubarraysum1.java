
import java.util.*;
public class maxsubarraysum1 {
    public static void printmaxsubarraysum(int [] number) {
        int start,end;
        int i,j,k;
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for (i=0;i<number.length;i++) {
            start = i;
            for (j=i;j<number.length;j++) {
                end = j;
                currsum = 0;
                for (k=start;k<end;k++) {
                   currsum = currsum + number[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The max subarray sum is "+ maxsum);
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        printmaxsubarraysum(numbers);
    }
}
