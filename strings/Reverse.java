import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Approach-1 
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.print(sb.toString());
        */
        /* Approach-2
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.print(sb.toString());
        */
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        } 
        System.out.print(rev);
    }
}