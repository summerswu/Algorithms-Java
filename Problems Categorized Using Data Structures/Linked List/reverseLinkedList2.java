/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
            if(m==n) return head;
            int first = m;
            int second = n;

            ListNode arr = new ListNode(0);
            arr.next = head;
            head = arr;

            while(first-1 > 0){
              head = head.next;
              first--;
            }

            ListNode nodeOne = head;
            head = head.next;
            ListNode nodeOneR = head;
        
            System.out.println(head.val);
        
            ListNode prev = null;
            ListNode tempNode = head;

            for(int i = 0; i< second - m + 1; i++){
              tempNode = head.next;
              head.next = prev;
              prev = head;
              head = tempNode;
            } 
        
            nodeOneR.next = head;
            nodeOne.next = prev;

            return arr.next;
    }
}