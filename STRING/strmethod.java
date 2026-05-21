public class strmethod{
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        String str3="lets learn java";
        System.out.println(str1.equals(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.length());
        System.out.println(str2.substring(1,3));
        System.out.println(str2.substring(2));
        System.out.println(str1.charAt(2));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.contains("learn"));
        System.out.println(str2.replace('w','h'));
        System.out.println(str2.indexOf('r'));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.startsWith("he"));
    }
}