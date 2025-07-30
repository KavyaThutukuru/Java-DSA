import java.util.Scanner;
public class RemoveDuplicate{
    public static void duplicate(String s){
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!seen[c]){
                sb.append(c);
                seen[c]=true;
            }
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        duplicate(s);
    }
}
/*
Set<Character> seen = new LinkedHashSet<>();
for (char c : s.toCharArray()) {
    seen.add(c);
}        
StringBuilder result = new StringBuilder();
for (char c : seen) {
    result.append(c);
}        
System.out.print(result.toString());
*/