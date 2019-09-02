class Solution {
    
    public Node flatten(Node head) {
        
        if(head == null) return head;
        
        Node arr = new Node(0);
        
        arr.next = head;
        
        while(head != null){
            if(head.child ==null){
                head = head.next;
                continue;
            }
            
            Node temp = head.child;
            
            while(temp.next != null)
                temp = temp.next;
            
            temp.next = head.next;
            if(head.next != null)head.next.prev = temp;
            
            head.next = head.child;
            head.child.prev = head;
            
            head.child = null;
        }
        
        return arr.next;
        
    }
}