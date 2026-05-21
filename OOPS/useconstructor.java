class Student {
    String name;
    int roll;
    Student(){                                                  //Default constructor
        System.out.println("constructor is called.....");       
    }
    Student(String name, int roll) {                            //parameterized constructor
        this.name = name;            //name=naam
        this.roll = roll;            //roll=rollno
    }
}
public class useconstructor {
    public static void main(String[] args) {
        //Student obj = new Student();
        Student obj = new Student("Vicky", 123);
        System.out.println(obj.name);
        System.out.println(obj.roll);
    }
}
