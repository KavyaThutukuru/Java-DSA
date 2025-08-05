package queues.circular;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size=sc.nextInt();
        Operations op=new Operations(size);
        int ch;
        do{
            System.out.println("\n1. Enqueue the element ");
            System.out.println("2. Dequeue the element");
            System.out.println("3. check queue is empty");
            System.out.println("4. check queue is full");
            System.out.println("5. Get front element");
            System.out.println("6. Get rear element");
            System.out.println("7. display queue");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter an element to insert into circular queue:");
                    int ele=sc.nextInt();
                    op.enqueue(ele);
                    break;
                case 2:
                    op.dequeue();
                    break;
                case 3:
                    if(op.isEmpty()){
                        System.out.println("Circular Queue is empty");
                    }else{
                        System.out.println("Circular Queue is not empty");
                    }
                    break;
                case 4:
                    if(op.isFull()){
                        System.out.println("Circular Queue is full");
                    }else{
                        System.out.println("Circular Queue is not full");
                    }
                    break;
                case 5:
                    Integer frontEle=op.getFront();
                    if(frontEle!=null)
                        System.out.println("Front: "+frontEle);
                    break;
                case 6:
                    Integer rearEle=op.getRear();
                    if(rearEle!=null)
                        System.out.println("Rear: "+rearEle);
                    break;
                case 7:
                    op.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=8);
        sc.close();
    }
}
