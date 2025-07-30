import java.util.Scanner;
public class CountVowelsConsonants{
    public static int[] vccount(String s){
        char[] input=s.toCharArray();
        int vowel=0,consonant=0;
        for(char c:input){
            char ch = Character.toLowerCase(c);
            if ("aeiou".indexOf(ch) != -1) {
                vowel++;
            } else{
                consonant++;;
            }
        }
        return new int[]{vowel,consonant};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] count=vccount(s);
        System.out.println("vowels: "+count[0]);
        System.out.println("Consonants: "+count[1]);
    }
}