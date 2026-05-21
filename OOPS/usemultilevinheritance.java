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
    int legs;
}
class dog extends Mammel{
    String breed;                                      
}
class usemultilevinheritance{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.color="white";
        obj.legs=4;
        obj.breed="BullDog";
        System.out.println(obj.color);
        System.out.println(obj.legs);
        System.out.println(obj.breed);
        obj.eat();
        obj.brethe();
    }
}