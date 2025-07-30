package linkedlist.doubly;
public class Main{
    public static void main(String[] args){
        Operations op=new Operations();
        op.insert_at_begin(5);
        op.insert_at_begin(10);
        op.insert_at_end(15);
        op.insert_at_position(20,2);
        //op.insert_at_position(1,0);
        //op.insert_at_position(5,7);
        //op.delete_at_begin();
        //op.delete_at_end();
        //op.delete_at_position(2);
        //op.delete_at_position(1);
        //op.delete_at_position(-1);
        op.forwardTraversal();
        System.out.println();
        op.backwardTraversal();
        System.out.println();
        int res=op.search(5);
        if(res!=-1){
            System.out.println("Node found at "+res+"th position");
        }else{
            System.out.println("Node not found in list");
        }
        op.findLength();
    }
}