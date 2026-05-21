class Animal{     //base class
    String color;
    void eat(){
        System.out.println("Eat...");
    }
    void brethe(){
        System.out.println("Breathes...");
    }
}
class Fish extends Animal{     //derived class
    void swim(){
        System.out.println("Fish can swim...");
    }
}
class useinheritance{
    public static void main(String[] args) {
        Fish obj =new Fish();
        obj.color="Black";
        System.out.println(obj.color); 
        obj.brethe();
        obj.eat();
        obj.swim();
    }
}