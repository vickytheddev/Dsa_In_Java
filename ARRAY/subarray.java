
public class subarray {
    public static void printsubarray(int [] number) {
        int start,end;
        for(int i=0;i<number.length;i++) {
            start = i;
            for(int j=i;j<number.length;j++) {
                end = j;
                for (int k=start;k<end;k++) {
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int [] number = {2,4,5,7,8,6};
        printsubarray(number);
    }
}
