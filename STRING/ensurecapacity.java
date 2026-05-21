public class ensurecapacity {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite");
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
