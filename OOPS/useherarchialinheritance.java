class Animal{
    String color;
    void eat(){
        System.out.println("Eat...");
    }
    void brethe(){
        System.out.println("Breathes...");
    }
}
class Mammel extends Animal{
    void walks(){
        System.out.println("Walks...");
    }                   
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swim...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly...");
    }
}
class useherarchialinheritance{
    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.color="red";
        System.out.println(obj.color);
        obj.eat();
        obj.brethe();
    }
}