import java.util.Scanner;
public class sandGlass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/