package stacks.applications;
import java.util.Scanner;
import java.util.Stack;
public class Postfix {
    public static void evaluate(String s){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            } else{
                int operand2=stack.pop();
                int operand1=stack.pop();
                switch(ch){
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        stack.push(operand1/operand2);
                        break;
                }
            }
        }
        System.out.println("Result: "+stack.pop());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter postfix expression");
        String s=sc.nextLine();
        evaluate(s);
        sc.close();
    }
}
