public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 100001) {
                return true;
            }
            head.val = 100001;
            head = head.next;
        }
        return false;
    }

    // Floyd's tortoise and hare solution
    public boolean hasCycleSolution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
