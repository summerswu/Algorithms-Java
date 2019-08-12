class Solution {
    public int openLock(String[] deadends, String target) {
        int finalStep = -1;
        int currStep = 0;
        
        Queue<String> queue = new LinkedList<String>();
        HashSet<String> deadEnds = new HashSet<String>(Arrays.asList(deadends)); 
        
        queue.offer("0000");//add root
            
        while(queue.size()!=0){
            int size = queue.size();
            
            for(int j = 0; j < size; j++){
                
                String head = queue.poll();
                
                if(head.equals(target)) finalStep = currStep;
                
                if(!deadEnds.contains(head)) {
                    for (int i = 0; i < 4; i++) {
                        for (int d = -1; d <= 1; d += 2) {
                            int y = ((head.charAt(i) - '0') + d + 10) % 10;
                            String nei = head.substring(0, i) + ("" + y) + head.substring(i+1);
                            if (!deadEnds.contains(nei)) {
                                queue.offer(nei);
                            }
                        }
                    }
                }
                deadEnds.add(head);
            } 
            currStep++; 
        }
        return finalStep;
    }
}