package linkedlist.polynomial;
public class Polynomial{
    ListNode head;
    void display(){
	    if(head==null){
		    System.out.println(0);
		    return;	
	    }
	    ListNode temp=head;
	    while(temp!=null){
		    if(temp.coef!=0){
			    if(temp.coef>0 && temp!=head){
				    System.out.print("+");
			    }
			    System.out.print(temp.coef+"x^"+temp.exp);
		    }
		    temp=temp.next;
	    }
    }
    void insert(int coef,int exp){
	    ListNode newNode=new ListNode(coef,exp);
	    if (head==null || head.exp<exp){
		    newNode.next=head;
		    head=newNode;
		    return;
	    }
	    ListNode temp=head;
	    while(temp.next!=null && temp.next.exp>=exp){
		    temp=temp.next;
	    }
	    newNode.next=temp.next;
	    temp.next=newNode;
    }
    public static Polynomial add(Polynomial poly1,Polynomial poly2){
        Polynomial res=new Polynomial();
        ListNode p1=poly1.head;
        ListNode p2=poly2.head;
        while(p1!=null && p2!=null){
            if(p1.exp==p2.exp){
                int sum_coef=p1.coef+p2.coef;
                if(sum_coef!=0){
                    res.insert(sum_coef,p1.exp);
                }
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.exp<p2.exp){
                res.insert(p2.coef,p2.exp);
                p2=p2.next;
            }
            else{
                res.insert(p1.coef,p1.exp);
                p1=p1.next;
            }
        }
        while(p1!=null){
            res.insert(p1.coef,p1.exp);
            p1=p1.next;
        }
        while(p2!=null){
            res.insert(p2.coef,p2.exp);
            p2=p2.next;
        }
        return res;
    }
    public static Polynomial sub(Polynomial poly1,Polynomial poly2){
        Polynomial res=new Polynomial();
        ListNode p1=poly1.head;
        ListNode p2=poly2.head;
        while(p1!=null && p2!=null){
            if(p1.exp==p2.exp){
                int diff=p1.coef-p2.coef;
                if(diff!=0){
                    res.insert(diff,p1.exp);
                }
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.exp>p2.exp){
                res.insert(p1.coef,p1.exp);
                p1=p1.next;
            }
            else{
                res.insert(-p2.coef,p2.exp);
                p2=p2.next;
            }
        }
        while(p1!=null){
            res.insert(p1.coef,p1.exp);
            p1=p1.next;
        }
        while(p2!=null){
            res.insert(-p2.coef,p2.exp);
            p2=p2.next;
        }
        return res;
    }
}