/**
 * Created by MH on 8/3/2017.
 */
public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        } else {
            ListNode result = null;
            ListNode tmp = null;
            while(head != null){
                tmp = head.next;
                head.next = result;
                result = head;
                head = tmp;
            }
            return result;
        }
    }
}
