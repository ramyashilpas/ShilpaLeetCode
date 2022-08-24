package shilpa.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
        /**
         * Test scaffold
         * !!! NOT PART OF SOLUTION !!!
         */
        public static void main(String[] args) throws IOException {

            // **** open buffered reder ****
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // **** read and split node values ****
            String[] strs = br.readLine().trim().split(",");

            // **** read `pos` ****
            int pos = Integer.parseInt(br.readLine().trim());

            // **** close buffered reader ****
            br.close();

            // **** convert string array to integer array ****
            int[] arr = Arrays.stream(strs).mapToInt(Integer::parseInt).toArray();

            // ???? ????
            System.out.println("main <<<  arr: " + Arrays.toString(arr));
            System.out.println("main <<<  pos: " + pos);

            // **** populate linked list ****
            ListNode head = populate(arr, pos);

            // ???? ????
            System.out.println("main <<< head: " + display(head));

            // **** invoke function of interest and display result ****
            System.out.println("main <<< hasCycle0: " + hasCycle0(head));

            // **** invoke function of interest and display result ****
            System.out.println("main <<<  hasCycle: " + hasCycle(head));
        }
    /**
     * Populate linked list from the contents of the specified array.
     *
     * !!! NOT PART OF SOLUTION !!!
     */
    static ListNode populate(int[] arr, int pos) {

        // **** sanity ckeck(s) ****
        if (arr.length == 0) return null;

        // **** initialization ****
        ListNode head   = null;
        ListNode cycle  = null;
        ListNode tail   = null;

        // **** traverse array adding nodes to the linked list ****
        for (int i = arr.length - 1; i >= 0; i--) {

            // **** update head of list ****
            head = new ListNode(arr[i], head);

            // **** update tail of list ****
            if (tail == null) tail = head;

            // **** save node at specified position ****
            if (pos == i) cycle = head;
        }

        // **** generate cycle ****
        if (cycle != null) tail.next = cycle;

        // **** return head of linked list ****
        return head;
    }
    /**
     * Display linked list.
     * Stops after last node or cycle detected.
     *
     * !!! NOT PART OF SOLUTION !!!
     */
    static String display(ListNode head) {

        // **** sanity check(s) ****
        if (head == null) return "";

        // **** initialization ****
        StringBuilder sb        = new StringBuilder();
        HashSet<ListNode> hs    = new HashSet<>();

        // **** traverse link list ****
        for (ListNode p = head; p != null; p = p.next) {

            // **** add this node to the hash set ****
            if (hs.add(p) == false) {
                sb.append(" cycle detected @ p.val: " + p.val);
                break;
            }

            // **** append node value to string builder ****
            sb.append(p.val);
            if (p.next != null)
                sb.append("->");
        }

        // **** return string representation of linked list ****
        return sb.toString();
    }
    /**
     * Given head, the head of a linked list,
     * determine if the linked list has a cycle in it.
     * Using a hash set.
     *
     * Runtime: O(n) - Space: O(n)
     *
     * Runtime: 4 ms, faster than 20.06% of Java online submission.
     * Memory Usage: 39.1 MB, less than 99.82% of Java online submissions.
     *
     * 20 / 20 test cases passed.
     * Status: Accepted
     * Runtime: 4 ms
     * Memory Usage: 39.1 MB
     */
    static public boolean hasCycle0(ListNode head) {

        // **** sanity checks ****
        if (head == null || head.next == null) return false;

        // **** initialization ****
        HashSet<ListNode> hs = new HashSet<>();

        // **** traverse the linked list looking for cycles ****
        for (ListNode p = head; p != null; p = p.next) {
            if (hs.add(p) == false) return true;
        }

        // **** cycle NOT found ****
        return false;
    }
    static public boolean hasCycle(ListNode head) {

        // **** sanity checks ****
        if (head == null || head.next == null) return false;

        // **** initialization ****
        ListNode h = head;
        ListNode t = head;

        // **** traverse the linked list - O(n) ****
        while (h != null && h.next != null) {

            // **** move t & h forward ****
            t = t.next;             // single speed
            h = h.next.next;        // double speed

            // **** check if we found a cycle ****
            if (h == t) return true;
        }

        // **** no cycle found ****
        return false;
    }
}
