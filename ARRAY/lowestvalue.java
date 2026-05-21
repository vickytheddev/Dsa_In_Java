
public class lowestvalue {
    public static int gerlowest(int [] number) {
        int lowest = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < number.length; i++) {
            if (lowest>number[i]) {
                lowest = number[i];
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        int [] number = {3,8,4,2,6,7};
        System.out.println(gerlowest(number));
    }
}
