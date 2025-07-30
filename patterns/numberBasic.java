import java.util.Scanner;
public class numberBasic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}