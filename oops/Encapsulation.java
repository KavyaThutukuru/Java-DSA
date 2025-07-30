//process of binding data and methods into single unit
//protects data from unauthorized access(data hiding)
//provides control over data(through getters and setters)
class StudentProperties{
    private String name;
    private String branch;
    private int rollno;
    public void setName(String n){
        name=n;
    }
    public void setBranch(String b){
        branch=b;
    }
    public void setRoll(int r){
        rollno=r;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public int getRoll(){
        return rollno;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        StudentProperties s=new StudentProperties();
        s.setName("Prasanna");
        s.setBranch("CSE");
        s.setRoll(564);
        System.out.println(s.getName());
        System.out.println(s.getBranch());
        System.out.println(s.getRoll());
    }
}