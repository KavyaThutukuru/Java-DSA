package stacks.applications;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top=stack.peek();
                if(ch==')' && top!='(' || ch=='}' && top!='{' || ch==']' && top!='[') return false;
                stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with parentheses: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is NOT valid.");
        }

        sc.close();

    }
}
