class Animal{     //base class
    Animal(){
        System.out.println("Animal constructor is called..");
    }
}
class Fish extends Animal{     //derived class
    public Fish(){
        super();
        System.out.println("Fish constructor is called..");
    }
}
class superkeyw{
    public static void main(String[] args) {
        Fish obj =new Fish(); 
    }
}