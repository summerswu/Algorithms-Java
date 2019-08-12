class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue;
        int finalStep = Integer.MAX_VALUE;
        int currStep = 0;
        
        HashSet<String> deadEnds = new HashSet<String>(Arrays.asList(deadends));
        
        queue.offer((String)0000);//add root
            
        while(queue.size()!=0){
            
            int size = queue.size();
            
            for(int i = 0; i<size; i++){
                String head = queue.poll();
                if(deadEnds.contains(head)) continue;
                if(head == target && currStep < finalStep) finalStep = currStep;
                
                int intHead = Integer.valueOf(head);
                int addInt = intHead;
                int combo = 1;
                inthead = inthead + combo;
                String add = Integer.toString(inthead);
                queue.add(add);
                deadEnds.add(add);
                
                for(int j = 1; j<4; j++){
                    intHead = addInt;
                    combo = 10*j;
                    inthead = inthead + combo;
                    String add = Integer.toString(inthead);
                    queue.add(add);
                    deadEnds.add(add);
                }
            }
            
            currStep++;
            
        }
        
        if(finalStep == Integer.MAX_Value) return -1;
        return finalStep;
    }
}