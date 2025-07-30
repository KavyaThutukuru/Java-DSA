import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static boolean checkAnagram(String s1,String s2){
       if(s1.length()!=s2.length()){
        return false;
       }
       char[] str1=s1.toCharArray();
       char[] str2=s2.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);
       return Arrays.equals(str1,str2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(checkAnagram(s1,s2)){
            System.out.print("Anagrams");
        } else{
            System.out.print("Not Anagrams");
        }
    }
}