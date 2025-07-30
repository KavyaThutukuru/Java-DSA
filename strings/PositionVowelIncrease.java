import java.util.Scanner;
public class PositionVowelIncrease{
    public static void vincrease(String s){
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                for(int j=0;j<=i;j++){
                    sb.append(ch);
                }
            }else{
                sb.append(ch);
            }
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        vincrease(s);
    }
}