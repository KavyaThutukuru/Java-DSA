import java.util.Scanner;
public class RemoveSubstring{
    public static void removeString(String s,String ss){
        String result="";
        int i=0;
        while(i<s.length()-ss.length()){
            if(s.substring(i,i+ss.length()).equals(ss)){
                i+=ss.length();
            }
            else{
                result+=s.charAt(i);
                i++;
            }
        }
        while(i<s.length()){
            result+=s.charAt(i++);
        }
        System.out.print(result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ss=sc.next();
        removeString(s,ss);
    }
}
/*s.replaceAll("ab","")*/