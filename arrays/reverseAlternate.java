import java.util.Scanner;
public class reverseAlternate{
    public static void reverse(int size,int[] a){
        int j=0,temp;
        while(j<size-1){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            j+=4;
        }
        for(int value:a){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(n%2==0){
            reverse(n,a);
        } else{
            reverse(n-1,a);
        }
    }
}