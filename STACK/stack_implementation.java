import java.util.*;
public class stack_implementation {

  private int top=-1;
  private final int MAX_SIZE=10;
  private int [] stack = new int[MAX_SIZE];

  void push(){
    if(top==MAX_SIZE-1){
      System.out.println("Stack is overflow.");
    }else{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter value that you want to insert: ");
      int val=sc.nextInt();
      top++;
      stack[top]=val;
    }
  }
  void pop(){
    if(top==-1){
      System.out.println("Stack is empty.");
    }else{
      int num = top;
      num = stack[top];
      top--;
      System.out.println("poped element is "+num);
    }
  }
  void display(){
    if(top==-1){
      System.out.println("Stack is empty.");
    }else{
      for(int i=top;i>=0;i--){
        System.out.println(stack[i]);
      }
    }
  }
}
