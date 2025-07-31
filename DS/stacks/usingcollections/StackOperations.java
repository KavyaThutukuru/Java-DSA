package stacks.usingcollections;
import java.util.Stack;
public class StackOperations {
    Stack<Integer> stack=new Stack<>();
    void push(int val){
        stack.push(val);
        System.out.println(val+" pushed");
    }
    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Popped: "+stack.pop());
        }
    }
    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        } else{
            System.out.println("Top of the stack: "+stack.peek());
        }
    }
    void display(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack:");
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
}