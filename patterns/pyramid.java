import java.util.Scanner;
public class pyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<n-i+1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }            
            }
            for (int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
    *
   ***
  *****
 *******
*********
*/ 

/*
for(int j=1;j<n-i;j++){
System.out.print(" ");
}
for (int k=1;k<=2*i+1;k++){
System.out.print("*");
}
*/