class Solution {
   public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode thishead) {
        // base case
        if(thishead == null || thishead.next == null) return thishead;
        
        ListNode newHead = reverseList(thishead.next);
        
        thishead.next.next = thishead;
        thishead.next = null;

        return newHead;
    }
}