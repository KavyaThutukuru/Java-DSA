import java.util.Scanner;
public class floyd_alphabet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)('A'+k));
                k++;
            }
            System.out.println();
        }
    }
}

/*
A
BC
DEF
GHIJ
KLMNO
*/