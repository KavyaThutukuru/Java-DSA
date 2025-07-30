import java.util.Scanner;
public class Palindrome{
    public static boolean checkPalindrome(String s){
        char[] rev=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            char temp=rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
        }
        String res=new String(rev);
        return s.equals(res);
        /*
        int left = 0, right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
    */
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(checkPalindrome(s))
            System.out.print("Palindrome");
        else
            System.out.print("Not palindrome");
    }
}