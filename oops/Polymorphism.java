//helps to perform a single action in different ways
//to improve code reusability and flexibility
//compile-time polymorphism(method overloading)
//run-time polymorphism(method overriding)
package oops;
public class Polymorphism{
    public static void main(String[] args){
        MethodOverloading ov=new MethodOverloading();
        ov.display();
        ov.display("seetha");
        System.out.println(ov.display(40.2,55.7));
        System.out.println(ov.display(40,55));
        System.out.println("Method Overriding");
        MethodOverriding or=new MethodOverriding();
        or.payment();
        or=new Online();
        or.payment();
        or=new Cash();
        or.payment();
    }
}