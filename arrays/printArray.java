import java.util.Scanner;
import java.util.Arrays;
public class printArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); // 1 2 3 4 5
        }
        System.out.println();
        for(int value:arr){
            System.out.print(value+" ");   // 1 2 3 4 5        
        }
        System.out.println();
        System.out.print(Arrays.toString(arr)); //[1,2,3,4,5]
    }
}