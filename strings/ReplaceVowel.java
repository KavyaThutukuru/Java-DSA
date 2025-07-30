import java.util.Scanner;
public class ReplaceVowel{
    public static void rvowel(String s){
        for(int ch=0;ch<s.length();ch++){
            if("AEIOUaeiou".indexOf(s.charAt(ch))!=-1){
                s=s.replace(s.charAt(ch),'@');
            }
        }
        System.out.print(s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        rvowel(s);
    }
}