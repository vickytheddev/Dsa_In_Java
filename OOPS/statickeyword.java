class Student {
    String name;
    int roll;
    static int numberofstudent;
    Student(String name, int roll) {                          
        this.name = name;            
        this.roll = roll;
        numberofstudent++;           
    }
}
public class statickeyword {
    public static void main(String[] args) {
        Student obj1 = new Student("Vicky", 123);
        System.out.println(obj1.numberofstudent);

        Student obj2 = new Student("Nitesh", 124);
        System.out.println(obj2.numberofstudent);

        Student obj3 = new Student("Rishabh", 125);
        System.out.println(obj3.numberofstudent);
        
        Student obj4 = new Student("Richa", 126);
        System.out.println(obj4.numberofstudent);
    }
}