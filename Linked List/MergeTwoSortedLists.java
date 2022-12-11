public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answ;

        if (list1 == null) {
            answ = list2;
            return answ;
        } else if (list2 == null) {
            answ = list1;
            return answ;
        }

        if (list1.val > list2.val) {
            answ = list2;
            list2 = list2.next;
        } else {
            answ = list1;
            list1 = list1.next;
        }

        ListNode head = answ;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                answ.next = list2;
                list2 = list2.next;
            } else {
                answ.next = list1;
                list1 = list1.next;
            }

            answ = answ.next;
        }

        if (list1 != null) {
            answ.next = list1;
        } else {
            answ.next = list2;
        }

        return head;
    }

    public ListNode mergeTwoListsSolution(ListNode list1, ListNode list2) {
        final ListNode root = new ListNode();
        ListNode prev = root;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list1 : list2;
        return root.next;
    }


}
