import java.util.Scanner;
public class number_xpattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int k=1;k<=2*n-1;k++){
                if(i==k || k==2*n-i){
                    System.out.print(n-i+1);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for (int k=1;k<=2*n-1;k++){
                if (k==n-i+1 || k==n+i-1 ){
                    System.out.print(i);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
3   3
 2 2
  1
 2 2
3   3
*/