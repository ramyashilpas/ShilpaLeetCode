package shilpa.leetcode;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
       /* public ListNode deleteDuplicates(ListNode head) {

            ListNode list = new ListNode();

            list.val = head.val;
            head = head.next;

            while(head.next != null) {
                if (list.val == head.val) {
                    System.out.println(head.val);
                    list.next= new ListNode(head.val);

                }
                list=head;
                head = head.next;
            }
            if (list.val != head.val) {
                list.next = new ListNode(head.val);
            }
            return list;*/
        // base case
        if(head == null) return null;

        // we keep two nodes for current and next data
        ListNode temp = head;
        ListNode tempNext = temp.next;

        // iterate until next node is not null
        while(tempNext != null){
            if(temp.val == tempNext.val){
                // we keep moving the next node till the data is equal to current node
                while(temp.val == tempNext.val){
                    tempNext = tempNext.next;
                    // edge case
                    if(tempNext == null) break;
                }
                // now change the links as next node is on new data
                temp.next = tempNext;
            }
            // move the current node
            temp = tempNext;
            // edge case for moving next node
            if(tempNext != null){
                tempNext = tempNext.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode m = new ListNode();
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(3)))));

        m = RemoveDuplicatesFromSortedList.deleteDuplicates(list);
        while(m.next!=null){
            System.out.println(m.val);
            m=m.next;
        }
        System.out.println(m.val);

    }
}
