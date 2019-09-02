class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
            if(m==n) return head;
            int first = m;
            int second = n;

            ListNode arr = new ListNode(0);
            arr.next = head;

            while(first-2 > 0){
              head = head.next;
              first--;
            }

            ListNode nodeOne = head;
            head = head.next;
            ListNode nodeOneR = head;
        
            System.out.println(head.val);
        
            ListNode prev = null;
            ListNode tempNode = head;

            while(head.next != null && second - m +1 > 0){
              tempNode = head.next;
              head.next = prev;
              prev = head;
              head = tempNode;
              second--;
            } 
        
            nodeOneR.next = head;
            nodeOne.next = prev;

            return arr.next;
    }
}