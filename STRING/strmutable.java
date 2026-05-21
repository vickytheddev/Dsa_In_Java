public class strmutable{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.append(" world"));
        System.out.println(sb.delete(3,4));
        System.out.println(sb.insert(4,"vicky"));
        System.out.println(sb.compareTo(sb));
        System.out.println(sb.reverse());        
        System.out.println(sb.replace(1,4,"bye"));      
        System.out.println(sb.capacity());      
    }
}