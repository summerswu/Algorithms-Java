class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)return true;
        
        ListNode newHead = reverseList(head);
        
        ListNode curr1 = head;
        ListNode curr2 = newHead;
        
        while(curr1.next != null && curr2.next != null){
            if(curr1.val != curr2.val){
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        // base case
        if(head == null || head.next == null) return head;
        
        ListNode newHead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}