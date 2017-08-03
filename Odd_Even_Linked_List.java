/**
 * Created by MH on 8/3/2017.
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

 You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

 Example:
 Given 1->2->3->4->5->NULL,
 return 1->3->5->2->4->NULL.
 */
public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode p = head, q =head;
        while (q != null) {
            q = q.next;
            if (q==null || q.next==null) break;
            ListNode next_p = p.next, next_q = q.next;
            q.next = next_q.next;
            p.next = next_q;
            next_q.next = next_p;
            p = p.next;
        }
        return head;
    }
}
