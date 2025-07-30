package stacks.usingarray;
public class Operations{
    private int top;
    private int maxSize;
    private int[] stack;
    public Operations(int size){
        this.top=-1;
        this.maxSize=size;
        this.stack=new int[size];
    }
    public void push(int element){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top]=element;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow ");
            return;
        }
        int temp=stack[top];
        top--;
        System.out.println("popped element:"+temp);
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Topof the stack:"+stack[top]);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
}