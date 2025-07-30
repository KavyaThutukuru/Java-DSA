interface in1{
    abstract void sum(int a,int b);
}
interface in2 extends in1{
    abstract void mul(int a,int b);
}
interface in3 extends in2{
    abstract void sub(int a,int b);
}
class cl implements in3{
    public void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    public void mul(int a,int b){
        System.out.println("Mul: "+(a*b));
    }
    public void sub(int a,int b){
        System.out.println("Diff: "+(a-b));
    }
}
public class ExtendingInterface{
    public static void main(String[] args){
        cl in=new cl();
        in.sum(20,30);
        in.mul(5,6);
        in.sub(60,20);
    }
}