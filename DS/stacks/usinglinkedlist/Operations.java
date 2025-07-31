package stacks.usinglinkedlist;
public class Operations{
    ListNode top;
    public void push(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=top;
        top=newNode;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("stack is underflow");
            return;
        }
        top=top.next;
    }
    public void display(){
        ListNode temp=top;
        if(isEmpty()){
            System.out.println("stack is underflow");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}