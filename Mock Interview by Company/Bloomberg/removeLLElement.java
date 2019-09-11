/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode pre = ans;
        while(head != null){
            if(head.val == val){
                pre.next = head.next;
                head = pre.next;
                continue;
            }
            pre = head;
            head = head.next;
        }
        return ans.next;
    }
}