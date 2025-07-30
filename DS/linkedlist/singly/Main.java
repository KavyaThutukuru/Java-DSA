package linkedlist.singly;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		LinkedList ob=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int choice,data,position;
        do{
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete from beginning ");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete at position");
            System.out.println("7. Display the list");
            System.out.println("8. Search the node");
            System.out.println("9. Find the length");
            System.out.println("10. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter value: ");
                    data=sc.nextInt();
                    ob.insert_at_begin(data);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    data=sc.nextInt();
                    ob.insert_at_end(data);
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    data=sc.nextInt();
                    position=sc.nextInt();
                    ob.insert_at_position(data,position);
                    break;
                case 4:
                    ob.delete_at_begin();
                    break;
                case 5:
                    ob.delete_at_end();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    position=sc.nextInt();
                    ob.delete_at_position(position);
                    break;
                case 7:
                    ob.traversal();
                    break;
                case 8:
                    System.out.println("Enter node to be searched ");
                    data=sc.nextInt();
                    int res=ob.search(data);
                    if(res!=-1){
                        System.out.println("Node found at "+res+"nd position");
                    } else{
                        System.out.println("Node not found");
                    }
                    break;
                case 9:
                    ob.findLength();
                    break;
                case 10:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(choice!=10);
        sc.close();
	}
}
