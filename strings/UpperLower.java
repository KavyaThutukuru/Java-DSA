import java.util.Scanner;
public class UpperLower{
    public static void positionChangeCase(String s){
        char[] input=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=input[i];
            if(i%2==0){
                sb.append(Character.toLowerCase(c));
            } else{
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        positionChangeCase(s);
    }
}