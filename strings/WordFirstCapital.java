import java.util.Scanner;
public class WordFirstCapital{
    public static void changeCapital(String s){
        String[] words=s.split(" ");
        for (int i=0;i<words.length;i++){
            int l=words[i].length();
            if(l>0){
                words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1,l).toLowerCase();
            }
        }
        System.out.print(String.join(" ", words));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        changeCapital(s);
    }
}