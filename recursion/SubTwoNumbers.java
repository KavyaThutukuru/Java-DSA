package recursion;
import java.util.Scanner;;
public class SubTwoNumbers {
    static int sub(int n1, int n2){
        if(n2==0){
            return n1;
        }
        else if(n2>0){
            return sub(n1-1,n2-1);
        }
        else{
            return sub(n1+1,n2+1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Subtraction of given two numbers: "+sub(num1,num2));
        sc.close();
    }
}
