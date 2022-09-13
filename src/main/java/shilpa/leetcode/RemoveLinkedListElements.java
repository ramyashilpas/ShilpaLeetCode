package shilpa.leetcode;

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode l=new ListNode(-1,head);
        if (head == null) return null;
        ListNode temp = l;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next=temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return l.next;
    }

    public static void main(String[] args) {
        //head = [1,2,6,3,4,5,6]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));

        int val = 6;
        ListNode listNode = RemoveLinkedListElements.removeElements(head, val);
        while(listNode.next!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println(listNode.val);
    }
}
