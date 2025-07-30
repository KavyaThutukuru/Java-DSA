import java.util.Scanner;
public class LargestFreqChar{
    public static void findchar(String s){
        int[] freq=new int[256];
        char result=' ';
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
            if (freq[ch]>max){
                max=freq[ch];
                result=ch;
            }
        }
        System.out.print(result+":"+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findchar(s);
    }
}