package shilpa.leetcode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            head = new ListNode(list2.val);
            list2 = list2.next;
        }

        head.next = mergeTwoLists(list1, list2);
        return head;
    }

    public static void main(String[] args) {

        ListNode m = new ListNode();
        ListNode list1 = new ListNode(10, new ListNode(12));
        ListNode list2 = new ListNode(20, new ListNode(23, new ListNode(45)));

        m = mergeTwoLists(list1, list2);

        while (m.next != null) {
            System.out.println(m.val);
            m = m.next;
        }
        System.out.println(m.val);
    }
}
