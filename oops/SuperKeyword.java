//refers immediate parent class or super class
//used to refer super class constructor-->super() ===>inside child class constructor and should be in first line
//used to refer super class variables-->super.variable_name
//used to refer super class methods-->super.method_name() ==>always write inside child class constructor or child class methods
class Super1{
    int c=5;
    Super1(){
        System.out.println("First class constructor");
    }
    void sum(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
}
class Super2 extends Super1{
    Super2(){
        super();
        super.sum(10,20);
        System.out.println("Second class constructor");
    }
    void display(int c){
        System.out.println(c);
        System.out.println(super.c);
    }
}
public class SuperKeyword{
    public static void main(String[] args){
        Super2 s=new Super2();
        s.display(45);
    }
}