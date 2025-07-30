import java.util.Scanner;
public class mountainArray{
    public static boolean validMountain(int n,int[] a){
        if (n<3){
            return false;
        }
        int i=0;
        while(i+1<n && a[i]<a[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && a[i]>a[i+1]){
            i++;
        }
        return i==n-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(validMountain(n,a));
    }
}