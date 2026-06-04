import java.util.*;
public class stackApplication {
  public static void main(String[] args) {
    int choice;
    stack_implementation s = new stack_implementation();
    do{
      System.out.println("----------Stack Menu----------");
      System.out.println(" 1. push");
      System.out.println(" 2. pop");
      System.out.println(" 3. display");
      System.out.println(" 4. exit");
      System.out.println("------------------------------");
      System.out.print("Enter your choice: ");
      Scanner sc = new Scanner(System.in);
      choice = sc.nextInt();
      switch (choice) {
        case 1:s.push(); break;
        case 2:s.pop(); break;
        case 3:s.display(); break;
        case 4:break;
        default: System.out.println("Enter vailed number");
      }
    }while(choice!=4);
    
  }
}
