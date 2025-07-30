//class contain both abstract method and concrete methods
//abstract method --> method without implementatiom ==> implementation in sub class
//we cannot create object for abstract class
package oops;
abstract class Ab1{
    int a,b;
    Ab1(int x,int y){
        a=x;
        b=y;
    }
    void sum(){//concrete method
        System.out.println("Sum: "+(a+b));
    }
    abstract void sub();//abstract method
    abstract void mul(int c,int d);
}
abstract class Ab2 extends Ab1{
    Ab2(){
        super(10,20);
    }
    void sub(){
        System.out.println("Sub: "+(a-b));
    }
    abstract void mul(int c,int d);
}
class Ab3 extends Ab2{
    Ab3(){
        super();
    }
    void mul(int c,int d){
        System.out.println("Mul: "+(c*d));
    }
}