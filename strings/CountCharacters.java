import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class CountCharacters{
    public static void frequency(String s){
        char[] arr=s.toCharArray(); 
        Map<Character,Integer> freq=new LinkedHashMap<>();
        for (char c:arr){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        frequency(s);
    }
}
/*
int[] freq = new int[256]; 
for (char c : s.toCharArray()) {
    freq[c]++;
}
for (int i = 0; i < freq.length; i++) {
    if (freq[i] > 0) {
        System.out.println((char) i + " : " + freq[i]);
    }
}
*/