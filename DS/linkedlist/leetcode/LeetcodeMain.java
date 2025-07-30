package linkedlist.leetcode;
public class LeetcodeMain{
    static class CustomLinkedList {
        ListNode head;

    // Add node at end
        public void add(int data) {
            ListNode newNode = new ListNode(data);

            if (head == null) {
                head = newNode;
                return;
            }

            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }
    public static void main(String args[]){
        CustomLinkedList list=new CustomLinkedList();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(6);
        Leetcode lc=new Leetcode(list.head);
        lc.sumEle();
        lc.countEle(2);
        lc.diffOddEvenSum();
        ListNode plus=lc.plusOne();
        lc.display(plus);
    }
}