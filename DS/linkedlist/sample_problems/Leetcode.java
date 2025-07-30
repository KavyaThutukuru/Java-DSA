package linkedlist.leetcode;
public class Leetcode{
    ListNode head;
    public Leetcode(ListNode head) {
        this.head = head;
    }
    public void sumEle(){
        int sum=0;
        ListNode curr=head;
        while(curr!=null){
            sum+=curr.data;
            curr=curr.next;
        }
        System.out.println("Sum of elements "+sum);
    }
    public void countEle(int val){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            if(curr.data==val){
                count++;
            }
            curr=curr.next;
        }
        System.out.println("Number of occurrences of "+val+" : "+count);
    }
    public void diffOddEvenSum(){
        int oddSum=0,evenSum=0;
        ListNode odd=head;
        ListNode even = (head != null) ? head.next : null;

        while (odd != null || even != null) {
            if (odd != null) {
                oddSum += odd.data;
                odd = (odd.next != null) ? odd.next.next : null;
            }
            if (even != null) {
                evenSum += even.data;
                even = (even.next != null) ? even.next.next : null;
            }
        }
        System.out.println("Difference between odd and even nodes sum "+Math.abs(oddSum-evenSum));
    }
    public void display(ListNode list){
		if(list==null){
			System.out.println("Linked List is empty");
			return;
		}
		ListNode temp=list;
		while (temp!=null){
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
        System.out.println("Null");
	}
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode plusOne(){
        head=reverse(head);
        ListNode curr=head;
        int carry=1;
        while(curr!=null && carry>0){
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if(curr.next == null && carry>0){
                curr.next=new ListNode(0);
            }
            curr=curr.next;
        }
        return reverse(head);
    }
}