package stacks.applications;
import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix{
    static int precedence(char op){
        switch(op){
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter infix expression:");
        String infix=sc.nextLine();
        StringBuilder postfix=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char c:infix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='(')
                    postfix.append(stack.pop());
                if(!stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(c)<=precedence(stack.peek()))
                    postfix.append(stack.pop());
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
            postfix.append(stack.pop());
        System.out.println("postfix expression: "+postfix.toString());
        sc.close();
    }
}