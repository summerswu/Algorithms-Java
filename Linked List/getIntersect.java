public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        
        ListNode branch1 = headA;
        ListNode branch2 = headB;
        
        while( branch1 != branch2 ){
            
                if(branch2 != null){
                    System.out.println("next1");
                    branch2 = branch2.next;
                } else {
                    branch2 = headA;
                }
            
                if(branch1 != null){
                    System.out.println("next2");
                    branch1 = branch1.next;  
                } else {
                    branch1 = headB;
                }
        }
        
        return branch1;
    }
}