//No return type is used along with constructor even void also
//It is written mainly to initialize variables
class Construct{
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println("Name:"+name+"\n Rollno: " +rollno+"\n Marks: "+marks);
    }
    //Default constructor
    Construct(){
        name="Kavya";
        rollno=678;
        marks=88.9;
        System.out.println("Hello");
    }
    //Parameterized constructor
    Construct(String n,int r,double m){
        name=n;
        rollno=r;
        marks=m;
    }
}
public class Constructor{
    public static void main(String[] args){
        Construct ob=new Construct();
        Construct ob1=new Construct("sri",785,86.4);
        ob.display();
        ob1.display();
    }
}