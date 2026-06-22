/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // return oneIteration(head);
        return optimalSol(head);

    }

    public boolean oneIteration(ListNode head) {
        ListNode temp = head;
        HashSet set = new HashSet<>();

        while(temp != null) {
            if (set.contains(temp)){
                return true;
            }

            set.add(temp);
            temp = temp.next;
        }

        return false;
    }

    public boolean optimalSol(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}