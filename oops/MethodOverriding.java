package oops;
public class MethodOverriding{
    void payment(){
        System.out.println("Online Payment");
    }
}
class Online extends MethodOverriding{
    @Override
    void payment(){
        System.out.println("Money paid through online");
    }
}
class Cash extends MethodOverriding{
    @Override
    void payment(){
        System.out.println("Money paid through cash");
    }
}