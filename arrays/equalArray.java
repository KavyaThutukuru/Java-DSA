import java.util.Scanner;
public class equalArray{
    public static boolean compare(int n1,int[] ar1,int n2,int[] ar2){
        if(n1!=n2){
            return false;
        }
        for (int i=0;i<n1;i++){
            if(ar1[i]!=ar2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] ar1=new int[n1];
        for(int i=0;i<n1;i++){
            ar1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] ar2=new int[n2];
        for(int i=0;i<n2;i++){
            ar2[i]=sc.nextInt();
        }
        if(compare(n1,ar1,n2,ar2)){
            System.out.print("Equal");
        } else{
            System.out.print("Not equal");
        }
    }
}