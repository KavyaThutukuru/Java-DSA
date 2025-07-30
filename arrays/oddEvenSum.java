import java.util.Scanner;
public class oddEvenSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenSum=0,oddSum=0;
        for(int i=0;i<n;i++){
            if (arr[i]%2==0){
                evenSum+=arr[i];
            } else{
                oddSum+=arr[i];
            }
        }
        int value=oddSum-evenSum;
        System.out.println("element based difference "+value);
        int eSum=0,oSum=0;
        for(int i=0;i<n;i++){
            if (i%2==0){
                eSum+=arr[i];
            } else{
                oSum+=arr[i];
            }
        }
        int v=eSum-oSum;
        System.out.println("index based difference "+v);
    }
}