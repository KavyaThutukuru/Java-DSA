//A method that belongs to the class or interface itself, not to instances
//Can be called without creating an instance
//Cannot be overridden (static methods are hidden, not overridden)
//Use static variables to store shared data
class Student1 {
    static String name = "abc";
    static int rollno = 123;
    static double marks = 92.5;
    static void display() {
        System.out.println(name + " " + rollno + " " + marks);
    }
}
public class StaticVarMet {
    public static void main(String[] args) {
        Student1 s1 = new Student1();  // optional here since display is static
        Student1.display();             // Access static method using class name
    }
}
