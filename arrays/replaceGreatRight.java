import java.util.Scanner;
import java.util.Arrays;
public class replaceGreatRight{
    public static void maximum(int n,int[] a){
        int max = -1;  
        for (int i = n - 1; i >= 0; i--) {
            int current = a[i];
            a[i] = max;      
            if (current > max) {
                max = current;
            }
        }
        System.out.print(Arrays.toString(a));
    }
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        maximum(n,a);
    }
}