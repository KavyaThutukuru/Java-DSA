package linkedlist.doubly;
public class Operations{
    ListNode head;
    ListNode tail;
    void forwardTraversal(){
        if(head==null){
            System.out.println("double linked list is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
    }
    void backwardTraversal(){
        if(head==null){
            System.out.println("double linked list is empty");
            return;
        }
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data);
            if (temp.prev != null) {
                System.out.print(" <- ");
            }
            temp=temp.prev;
        }
    }
    void insert_at_begin(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    void insert_at_end(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=tail=newNode;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
        /*Another approach
          ListNode temp=head;
          while(temp.next!=null){
            temp=temp.next;
          }
          temp.next=newNode;
          newNode.prev=temp;
        */
    }
    void insert_at_position(int data, int pos){
        ListNode newNode=new ListNode(data);
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }
        else if(pos==1){
            newNode.next=head;
            if(head!=null){
                head.prev=newNode;
            }
            head=newNode;
            return;
        } else{
            ListNode temp=head;
            int count=1;
            while(temp!=null && count<pos-1){
                temp=temp.next;
                count++;
            }
            if(temp==null){
                System.out.println("Out or range");
                return;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            if(temp.next!=null){
                temp.next.prev=newNode;
            }
            temp.next=newNode;
        }
    }
    void delete_at_begin(){
        if(head==null){
            System.out.println("Double linked list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void delete_at_end(){
        if(head==null){
            System.out.println("Double linked list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        /*Another approach
          ListNode temp=head;
          while(temp.next!=null){
            temp=temp.next;
          }
          temp.prev.next=null;
        */
    }
    void delete_at_position(int pos){
        if(pos<1){
            System.out.println("Invalid position");
            return;
        }
        else if(head==null){
            System.out.println("Double linked list is empty");
            return;
        }
        else if(pos==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        } else{
            ListNode temp=head;
            int count=1;
            while(temp!=null && count<pos){
                temp=temp.next;
                count++;
            }
            if(temp==null){
                System.out.println("Out of range");
                return;
            }
            if(temp.prev!=null){
                temp.prev.next=temp.next;
            }
            if(temp.next!=null){
                temp.next.prev=temp.prev;
            }
        }
    }
    int search(int data){
        ListNode temp=head;
        int position=1;
        while(temp!=null){
            if(temp.data==data){
                return position;
            }
            temp=temp.next;
            position++;
        }
        return -1;
    }
    void findLength(){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Length of doubly linked list:"+count);
    }
}