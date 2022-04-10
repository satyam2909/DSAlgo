public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode A, int B) {
        if(A==null)
            return null;

        ListNode head = A;

        int length =0;

        while(head!=null){
            head=head.next;
            length++;

        }
        if(length==1)
            return null;

        if(B>=length)
            return A.next;

        head=A;


        for(int i=1;i<length-(B-1)-1;i++){
            head=head.next;
        }

        if(head.next.next==null){
            head.next=null;
            return A;}


        // System.out.println(head.val);
        head.next=head.next.next;

        return A;

    }

}
