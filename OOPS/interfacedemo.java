interface car{
    public void start();
}
class Electriccar implements car{
    public void start(){
        System.out.println("Electric car starts");
    }
}
class Dieselcar implements car{
    public void start(){
        System.out.println("Diesel car starts");
    }
}
public class interfacedemo{
    public static void main(String[] args) {
        car tesels = new Electriccar();
        car XUV700 = new  Dieselcar();
        tesels.start();
        XUV700.start();
    }
}