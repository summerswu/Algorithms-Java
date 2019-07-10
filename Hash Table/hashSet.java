
class MyHashSet {
    final ListNode[] nodes = new ListNode[10000];

    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        ListNode endNode = new ListNode(0);
        ListNode newNode = new ListNode(key);
        int i = hash(key);
        if (nodes[i] == null) 
            nodes[i] = newNode;
        
        else{
            endNode = end(nodes[i]);
            endNode.next = newNode;
        }
    }
    
    public void remove(int key) {
        int i = hash(key);
        ListNode head = nodes[i];
        if (this.contains(key) == false) 
            return;
        else{
            while(head != null){
                while(head.next.val == key){
                    head.next = head.next.next;
                }
                    head = head.next;
                }
            }
        }
        return;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int i = hash(key);
        ListNode head = nodes[i];
        if (head == null){
            System.out.println("triggered");
            return false;}
        else {
            System.out.println(head.val);
            while(head != null){
                if(head.val == key){
                    return true;
                }
                head = head.next;
            }
        }
        return false;
    }
    
    ListNode end(ListNode head){
    
        while(head.next != null){
            head = head.next;
        }
        return head;
    }
    
    int hash(int value) { return Integer.hashCode(value) % nodes.length;}
    
    class ListNode {//defining a list node class that's unique to this 
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
    }
}