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
        // return iterativeApproach(head);
        return stackApproach(head);

    }

    public ListNode iterativeApproach(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        
        }
        

        return prev;
    }

    public ListNode stackApproach(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        
        Stack<ListNode> stack = new Stack<>();

        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode newHead = stack.pop();
        current = newHead;

        while (!stack.isEmpty()) {
            current.next = stack.pop(); 
            current = current.next;   
        }

        current.next = null;

        return newHead;
    }
}