/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode l = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(head != null){
            a.add(head.val);
            head = head.next;
        }

        Collections.reverse(a);
        // System.out.print(a);

        ListNode curr = l;
        int j = 0;
        while(l != null){
            l.val = a.get(j);
            j++;
            l = l.next;
        }

        return curr;
    }
}
