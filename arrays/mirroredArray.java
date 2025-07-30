import java.util.Scanner;
public class mirroredArray{
    public static void mirror(int n,int[] ar){
        boolean flag=true;
        for (int i=0;i<n/2;i++){
            if(ar[i]!=ar[n-i-1]){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.print("Mirrored array");
        } else{
            System.out.print("Not Mirrored array");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        mirror(n,ar);
    }
}