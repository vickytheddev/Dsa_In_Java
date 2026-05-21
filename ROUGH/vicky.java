class Animal{     //base class
    void eat(){
        System.out.println("Eat...");
    }
    void brethe(){
        System.out.println("Breathes...");
    }
}
class Dog extends Animal{     //derived class
    void bark(){
        System.out.println("Dog can bark...");
    }
}
class vicky{
    public static void main(String[] args) {
        Dog obj =new Dog();
        obj.eat();
        obj.brethe();
        obj.bark();
    }
}