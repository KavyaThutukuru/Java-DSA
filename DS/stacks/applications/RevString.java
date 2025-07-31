package stacks.applications;

import java.util.Stack;
import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> rev = new Stack<>();
        String s = sc.nextLine();
        sc.close();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            rev.push(s.charAt(i));
        }

        while (!rev.isEmpty()) {
            res += rev.pop();
        }

        System.out.println(res);
    }
}
