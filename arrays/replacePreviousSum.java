import java.util.Scanner;
public class replacePreviousSum{
    public static void replacePrevious(int size,int[] a){
        int j=1,temp,sum=a[0];
        while(j<size){
            temp=a[j];
            a[j]=sum;
            sum+=temp;
            j+=1;
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
        replacePrevious(n,a);
    }
}