/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        
        ListNode arr = new ListNode(0);
        ListNode curr = arr;
        
        int carry = 0;
        
        while(first != null || second != null){
            
           int x = (first != null) ? first.val : 0;
           int y = (second != null) ? second.val : 0;
            
           int val = carry + x + y;
            
           if(carry == 1) carry = 0;
            
           if(val >= 10){
               carry = 1;
               val = val%10;
           }
            
           ListNode newNode = new ListNode(val);
            
           curr.next = newNode;
           if(first!=null)first = first.next;
           if(second!=null)second = second.next;
           curr = curr.next;
        }
        
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return arr.next;
    }
}