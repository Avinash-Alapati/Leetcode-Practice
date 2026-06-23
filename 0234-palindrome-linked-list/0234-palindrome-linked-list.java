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
    public boolean isPalindrome(ListNode head) {

        ListNode org = head;
        ListNode reversed = reversed(head);

        while(org != null) {
            if(org.val != reversed.val) {
                return false;
            }
            org = org.next;
            reversed = reversed.next;
        }

        return true;

    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nextNode = new ListNode(curr.val);

            nextNode.next = prev;
            prev = nextNode;

            curr = curr.next;
        }

        return prev;
    }
}