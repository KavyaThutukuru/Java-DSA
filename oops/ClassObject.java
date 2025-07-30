class Student{
        String name;
        int rollno;
        double marks;
        void display(){
            System.out.println(name+" "+rollno+" "+marks);
        }
    }
public class ClassObject{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Kavya";
        s1.rollno=123;
        s1.marks=90.2;
        s1.display();
    }
}