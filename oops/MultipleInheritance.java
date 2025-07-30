interface Parent1{
    abstract void display();
}
interface Parent2{
    abstract void display();
}
interface Parent3{
    abstract void display();
}
class SubClass implements Parent1,Parent2,Parent3{
    public void display(){
        System.out.println("Multiple Inheritance");
    }
} 
public class MultipleInheritance{
    public static void main(String[] args){
        SubClass sb=new SubClass();
        sb.display();
    }
}