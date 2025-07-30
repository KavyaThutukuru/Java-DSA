import java.util.Scanner;
public class hollowReversePyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int k=2*n-1;k>=1;k--){
                if(i==1 || i==k || k==2*n-i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
*********
 *     *
  *   *
   * *
    *
*/