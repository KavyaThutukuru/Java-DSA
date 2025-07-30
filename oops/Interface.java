//contain only abstract methods
//we cannot create object
interface Abc{
    void print();// implicitly public and abstract
    public abstract void display();//It's allowed, but unnecessary
    static void greet() {
        System.out.println("Method with static keyword");
    }
}
class Pqr implements Abc{
    public void display(){
        System.out.println("First Method");
    }
    public void print(){
        System.out.println("Second Method");
    }
}
public class Interface{
    public static void main(String[] args){
        Abc.greet(); // calling static method
        Pqr ob=new Pqr();
        ob.display();
        ob.print();
    }
}