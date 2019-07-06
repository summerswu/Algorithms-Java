class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode start = new ListNode(0);//making the 0th position
        start.next = head;
        ListNode slow = start, fast = start;//making two pointers at the 0th position
        //the head is first position, slow.next here is the 1 position beacuse slow is at the zeroth position
        
         for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
         }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;//skip forward two steps
        return start.next;//return the head
    }
}