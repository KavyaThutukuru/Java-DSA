import java.util.Scanner;
public class ChangeCase{
    public static void change(String s){
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            } else{
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        change(s);
    }
}