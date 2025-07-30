package linkedlist.circularly;
public class Operations{
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("Circular linked list is empty");
            return;
        }
        ListNode temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }
    void insert_at_begin(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        ListNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    void insert_at_end(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        ListNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    void delete_at_begin(){
        if(head==null){
            System.out.println("Circular linked list is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        ListNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=temp.next;
    }
    void delete_at_end(){
        if(head==null){
            System.out.println("Circular linked list is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        ListNode temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
}