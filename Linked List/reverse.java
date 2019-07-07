class Solution {
    public ListNode reverseList(ListNode head) {
          
          
          ListNode pointer = head;
          ListNode nextVal = head;
          ListNode holder = head;
          
          while(nextVal.next != null){
              holder = pointer;
              pointer = pointer.next;
              nextVal = pointer.next;
              pointer.next = holder;
              pointer = nextVal;
              System.out.println("Holder is " + holder.val);
              System.out.println("Pointer is " + pointer.val);
              System.out.println("NextVal is " + nextVal.val);
          }
        
          head.next = null;
    
          return pointer;
    }
}