import java.util.Scanner;
import java.util.Arrays;
public class plusOne{
    public static void increment(int n,int[] a){
        for(int i=n-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                System.out.println(Arrays.toString(a));
                return;
            }
            a[i]=0;
        }
        int[] result = new int[n + 1];
        result[0] = 1; 
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        increment(n,a);
    }
}