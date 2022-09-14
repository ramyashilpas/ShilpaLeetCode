package shilpa.leetcode;


public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode next;
       while(head!=null){
           next=head.next;
           head.next=prev;
           prev=head;
           head=next;
       }
       return prev;
    }

    public static void main(String[] args) {
        //head = [1,2,3,4,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNode=ReverseLinkedList.reverseList(head);
        while(listNode.next!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println(listNode.val);
    }
}
