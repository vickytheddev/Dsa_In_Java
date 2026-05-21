
import java.util.*;
public class callbyrefer {
    public static void update(int [] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {67,78,97};
        update(marks);
        int i;
        for (i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
