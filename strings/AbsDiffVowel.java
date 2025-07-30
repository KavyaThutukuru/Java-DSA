import java.util.Scanner;
public class AbsDiffVowel{
    public static int countVowel(String part){
        char[] input=part.toCharArray();
        int count=0;
        for(char ch:input){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void difference(String s){
        int mid=s.length()/2;
        int left=countVowel(s.substring(0,mid+1));
        int right=countVowel(s.substring(mid+1,s.length()));
        System.out.print(Math.abs(left-right));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        difference(s);
    }
    /*
    int left=0,right=s.length()-1;
    int vc1=0,vc2=0;
    while(left<right){
        if("AEIOUaeiou".indexOf(s.charAt(left))!=-1 && left!=right){
            vc1++;
        }
        if("AEIOUaeiou".indexOf(s.charAt(right)!=-1)){
            vc2++;
        }
        left++;
        right--;
    }
    System.out.print(Math.abs(vc1-vc2));
    */
}