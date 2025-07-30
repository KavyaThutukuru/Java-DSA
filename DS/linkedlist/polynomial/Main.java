package linkedlist.polynomial;
public class Main{
    public static void main(String[] args){
        Polynomial p1=new Polynomial();
        p1.insert(-2,3);
        p1.insert(3,5);
        p1.display();
        System.out.println();
        Polynomial p2=new Polynomial();
        p2.insert(3,3);
        p2.insert(5,5);
        p2.insert(2,6);
        p2.display();
        System.out.println();
        Polynomial sum=Polynomial.add(p1,p2);
        sum.display();
        System.out.println();
        Polynomial diff=Polynomial.sub(p1,p2);
        diff.display();
    }
}