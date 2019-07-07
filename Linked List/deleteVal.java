class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while(curr.next != null){
            ListNode holder = curr.next;
            
            if (holder.val == val){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}