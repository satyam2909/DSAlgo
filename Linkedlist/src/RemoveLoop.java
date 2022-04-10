public class RemoveLoop {

    public ListNode solve(ListNode A) {

        ListNode slow = A;
        ListNode fast =A;

        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow)
                break;
        }

        /*if(slow==null || slow.next==null)
        return A;*/

        if(fast==null || fast.next==null)
            return A;

        slow=A;

        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }

        //now slow and fast are at starting of loop

        ListNode start =slow;

        slow=slow.next;

        while(slow.next!=start)
            slow=slow.next;

        slow.next=null;

        return A;

    }

}
