package linkedlist.circularly;
public class Main{
    public static void main(String[] args){
        Operations ops=new Operations();
        ops.insert_at_begin(20);
        ops.insert_at_begin(15);
        ops.insert_at_end(30);
        ops.delete_at_begin();
        ops.delete_at_end();
        ops.traversal();
    }
}