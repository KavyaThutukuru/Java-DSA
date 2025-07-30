import java.util.Scanner;
public class Longest{
    public static void findLong(String s){
        String current="";
        String longest="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(current.indexOf(c)!=-1){
                current=current.substring(current.indexOf(c)+1);
            }
            current+=c;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.print(longest);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findLong(s);
    }
}