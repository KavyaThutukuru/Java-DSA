//same method name but different number of parameters or their return type
package oops;
public class MethodOverloading{
    void display(){
        System.out.println("Method Overloading");
    }
    void display(String s){
        System.out.println("Name: "+s);
    }
    double display(double s1,double s2){
        return s1+s2;
    }
    int display(int sub1,int sub2){
        return sub1+sub2;
    }
}