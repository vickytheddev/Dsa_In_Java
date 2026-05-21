
public class pair {
    public static void printpair(int [] numbers) {
        int i,j;
        for(i=0;i<numbers.length;i++) {
           int temp=numbers[i];
            for(j=i+1;j<numbers.length;j++) {
                System.out.print(" ("+ temp + "," + numbers[j] +") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        printpair(numbers);
    }
}
