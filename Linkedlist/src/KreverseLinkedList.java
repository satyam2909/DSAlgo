
import java.util.*;

public class KreverseLinkedList {

    // contains other methods of LL aswell like add first/last etc

    public ListNode reverseList(ListNode A, int B) {

        ArrayList<ListNode> list = new ArrayList<>();
        ArrayList<ListNode> afterReverse = new ArrayList<>();
        list.add(A);
        ListNode head = A;
        int i =1;

        while(head.next!=null){
            if(i%B==0){
                if(head.next!=null){
                    list.add(head.next);}}

            i++;
            head=head.next;
        }



        for(i=0; i<list.size(); i++){
            head = list.get(i);
            for(int j=1; j<B; j++){
                head = head.next;
            }
            head.next = null;

        }



        for(ListNode x: list){
            afterReverse.add(reverse(x));

        }

        for(i=0; i<afterReverse.size()-1; i++){
            ListNode tail = getTail(afterReverse.get(i));

            tail.next = afterReverse.get(i+1);
        }

        return afterReverse.get(0);


    }

    public ListNode getTail(ListNode A){
        ListNode head = A;

        while(head.next!=null){
            head = head.next;
        }

        return head;
    }

    public ListNode reverse(ListNode A){

        ListNode head = A;
        ListNode prev = null;
        ListNode after = null;



        while(head!=null){

            after = head.next;

            head.next = prev;

            prev = head;

            head = after;

        }

        return prev;

    }

    public ListNode addFirst(ListNode A,int i){

        ListNode x = new ListNode(i);
        x.next = A;

        return x;
    }

    public ListNode addLast(ListNode A,int i){

        ListNode x = new ListNode(i);
        ListNode head = A;
        while(head.next!=null)
            head = head.next;

        head.next = x;

        return A;

    }


    public ListNode removeLast(ListNode A){

        ListNode prev = null;
        ListNode head = A;

        while(head.next!=null){
            prev =head;
            head= head.next;
        }

        prev.next = null;

        return A;

    }

}
