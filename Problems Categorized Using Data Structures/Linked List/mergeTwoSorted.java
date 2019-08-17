class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode arr = new ListNode(0);//initiate a new head node;
        ListNode head = arr;
        
        while( l1 != null || l2 != null){//iterating through the two lists
        //while the one of the two nodes are not null
            if( l1 != null && (l2 == null || l1.val < l2.val)) {
                head.next = l1;
                l1 = l1.next;
            }//if first is larger then second, first = head.next head.next
            else {
                head.next = l2;
                l2 = l2.next;
            }
            //second is head.next,
            head = head.next;     
        }
        
        return arr.next;//return new fake head.next;
        
    }
}