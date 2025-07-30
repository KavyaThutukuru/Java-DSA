package linkedlist.singly;
public class LinkedList{
	ListNode head;
	void traversal(){
		if(head==null){
			System.out.println("Linked List is empty");
			return;
		}
		ListNode temp=head;
		while (temp!=null){
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("Null");
	}
    void insert_at_begin(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void insert_at_end(int data){
        ListNode newNode=new ListNode(data);
        //newNode.data=data;
        //newNode.next=null;
        if (head==null){
            head=newNode;
            return;
        }
        ListNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insert_at_position(int data,int position){
        ListNode newNode=new ListNode(data);
        ListNode temp=head;
        int curr_pos=1;
        if (position<1){
            System.out.println("Invalid position");
        }
        else if (position==1){
            newNode.next=head;
            head=newNode;
            return;
        } 
        else{
            while (temp!=null && curr_pos<position-1){
                temp=temp.next;
                curr_pos++;
            }
            if(temp==null){
                System.out.println("Position out of range");
                return;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    void delete_at_begin(){
        if (head==null){
            System.out.println("Linked List is empty. No deletion is possible...");
            return;
        }
        head=head.next;
    }
    void delete_at_end(){
        if (head==null){
            System.out.println("Linked List is empty");
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            /*
            ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            */
        }
    }
    void delete_at_position(int position){
        if (position<1){
            System.out.println("Invalid Position");
            return;
        }
        else if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        else if(position==1){
            head=head.next;
            return;
        }
        else{
            ListNode temp=head;
            ListNode prev=null;
            int curr_pos=1;
            while(temp!=null && curr_pos<position){
                prev=temp;
                temp=temp.next;
                curr_pos++;
            }
            if(temp==null){
                System.out.println("Position Out of range");
            }
            prev.next=temp.next;
        }
    }
    int search(int val){
        ListNode temp=head;
        int pos=1;
        while(temp!=null){
            if(temp.data==val){
                return pos;
            }
            temp=temp.next;
            pos++;
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
        System.out.println("Length of linked list:"+count);
    }
}