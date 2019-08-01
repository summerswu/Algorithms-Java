class Solution {
    public ListNode reverseList(ListNode head) {
          
          
          ListNode pointer = head;
          ListNode nextVal = null;
          ListNode Creator = null;
          
          while(pointer != null){
              
              nextVal = pointer.next;
              pointer.next = Creator;
             
              
              Creator = pointer;
              pointer = nextVal;
              
          }
    
          return Creator;
    }
}