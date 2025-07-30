public class MethodParameters{
    String name="sri";
    int rollno=356;
    double marks=97.2;
    void display(String n,int r,double m){
        System.out.println("Name: "+n);
        System.out.println("RollNo: "+r);
        System.out.println("Marks: "+m);
    }
    public static void main(String[] args){
        MethodParameters ob=new MethodParameters();
        ob.display("kavya",123,92.8);//passing values directly
        ob.display(ob.name,ob.rollno,ob.marks);//passing values using object
    }
}