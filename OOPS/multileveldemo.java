interface A{
    void run();
}
interface B{
    void play();
}
class C implements A,B{
    public void run(){
        System.out.println("Army is runing on field");
    }
    public void play(){
        System.out.println("Children are playing on the ground");
    }
}
public  class multileveldemo{
    public static void main(String [] args){
        C obj = new C();
        obj.run();
        obj.play();
    }
}