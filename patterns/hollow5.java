import java.util.Scanner;
public class hollow5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n-i+1;j++){
                if (i==1 || j==n-i+1 || j==1){
                    System.out.print(j);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
12345
 1  4
  1 3
   12
    1
*/