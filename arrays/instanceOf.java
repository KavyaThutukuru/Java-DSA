public class instanceOf{
    public static void main(String[] args){
        String str="Java program";
        int[] numbers=new int[5];
        boolean result1,result2;
        result1=str instanceof String;
        result2=numbers instanceof int[];
        System.out.println(result1);
        System.out.println(result2);
    }
}