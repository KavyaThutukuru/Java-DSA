class First{
    int a=10,b=20;
    void sum(){
        System.out.println("Sum: "+(a+b));
    }
}
class Second extends First{
    int c=30;
    void product(){
        System.out.println("Product: "+(a*b));
    }
    void difference(){
        System.out.println("Diff: "+(c+a-b));
    }
}
public class Inheritance{
    public static void main(String[] args){
        Second obj=new Second();
        obj.sum();
        obj.product();
        obj.difference();
    }
}