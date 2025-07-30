package stacks.usingarray;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Operations op=new Operations(size);
        int ch;
        do{
            System.out.println("\n1. Push the element");
            System.out.println("2. Pop the element");
            System.out.println("3. check stack is empty");
            System.out.println("4. check stack is full");
            System.out.println("5. Top of stack");
            System.out.println("6. display stack");
            System.out.println("7. Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter an element to push onto the stack:");
                    int ele=sc.nextInt();
                    op.push(ele);
                    break;
                case 2:
                    op.pop();
                    break;
                case 3:
                    if(op.isEmpty()){
                        System.out.println("Stack is empty");
                    }else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 4:
                    if(op.isFull()){
                        System.out.println("Stack is full");
                    }else{
                        System.out.println("Stack is not full");
                    }
                    break;
                case 5:
                    op.peek();
                    break;
                case 6:
                    op.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=7);
    }
}