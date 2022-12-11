public class LinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = null;
        ListNode nxt = head;
        while (nxt != null) {
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
            curr.next = prev;
        }
        return curr;
    }
}
