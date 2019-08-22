/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode start = new ListNode(0);
        ListNode curr;
        curr = start;
        
        while(true){
            
            boolean isBreak = true;
            
            int min = Integer.MAX_VALUE;
            
            int min_index = 0;
            
            for(int i = 0; i <lists.length; i++){
            
                if(lists[i] != null && lists[i].val <= min){
                    min = lists[i].val;
                    min_index = i;
                    isBreak = false;
                }
                
            }
             if (isBreak) break;
            curr.next = lists[min_index];
            curr = curr.next;
            lists[min_index] = lists[min_index].next; 
            
        }
        
        return start.next;
        
    }
}