public class capacity {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Welcome");
        System.out.println(sb2.capacity());
        sb2.append("vicky");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
    }
}
