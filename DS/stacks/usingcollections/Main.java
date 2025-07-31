package stacks.usingcollections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StackOperations op=new StackOperations();
        int ch;
        do{
            System.out.println("1. Push the element");
            System.out.println("2. Pop the element");
            System.out.println("3. Top of stack");
            System.out.println("4. display stack");
            System.out.println("5. Exit");
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
                    op.peek();
                    break;
                case 4:
                    op.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=5);
        sc.close();
    }
}