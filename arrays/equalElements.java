import java.util.Scanner;
public class equalElements{
    public static boolean compareArray(int n,int[] ar1,int[] ar2){
        int[] freq=new int[10];
        for (int value:ar1){
            freq[value]++;
        }
        for (int value:ar2){
            freq[value]--;
        }
        for(int value:freq){
            if(value!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar1=new int[n];
        for(int i=0;i<n;i++){
            ar1[i]=sc.nextInt();
        }
        int[] ar2=new int[n];
        for(int i=0;i<n;i++){
            ar2[i]=sc.nextInt();
        }
        if (compareArray(n,ar1,ar2)){
            System.out.print("Same Elements");
        } else{
            System.out.print("Different Elements");
        }
    }
}