import java.util.Scanner;
public class ReverseTwoPointers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] rev=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            char temp=rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
        }
        /*System.out.println(Arrays.toString(rev));*/
        String result=new String(rev);
        System.out.print(result);
    }
}