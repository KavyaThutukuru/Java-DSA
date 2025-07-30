class COverload{
    COverload(){
        System.out.println("Constructor Overloading");
    }
    COverload(int roll,String name){
        System.out.println("RollNO: "+roll+" Name: "+name);
    }
    COverload(int roll,String name,double marks){
        System.out.println("RollNO: "+roll+" Name: "+name+" Marks: "+marks);
    }
}
public class ConstructorOverloading{
    public static void main(String[] args){
        COverload co=new COverload();
        COverload co1=new COverload(253,"Lakshmi");
        COverload co2=new COverload(244,"Radha",68.6);
    }
}