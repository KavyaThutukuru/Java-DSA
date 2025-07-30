//refers current object
class Construct1{
    int a=10,b=20,c=30;
    Construct1(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void sum(){
        int sum=a+b+c;
        System.out.print("Sum: "+sum);
    }
}
public class ThisKeyword{
    public static void main(String[] args){
        Construct1 ob=new Construct1(5,6,7);
        ob.sum();
    }
}