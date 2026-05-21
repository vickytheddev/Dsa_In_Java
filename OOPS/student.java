class studentclass{
    String name;
    int age;
    double percentage;
    final String schoolname="E.P.S";   //final keyword
}
class student {
    public static void main(String[] args) {
        studentclass obj = new studentclass();
        obj.name="vicky";
        obj.age=20;
        obj.percentage=77.6;
        System.out.println("name= " + obj.name);
        System.out.println("age= " + obj.age);
        System.out.println("percentage= " + obj.percentage);
        System.out.println("schoolname= " + obj.schoolname);   //final keyword
    }
}
 