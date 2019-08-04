class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> uniqueAdd = new HashSet<String>();
        
        for(int x = 0; x<emails.length; x++){
            char[] curr = emails[x].toCharArray();
            boolean afterAt = false;
            ArrayList<Character> parsed = new ArrayList<Character>();
            for(int i = 0; i<curr.length; i++) {
                if(curr[i] == '+'){
                    while(curr[i]!='@'){
                        i++;
                    }
                }
                if(curr[i] == '@')afterAt = true;
                if(curr[i] =='.' && afterAt == false){
                    continue;
                }
                parsed.add(curr[i]);
            }
            System.out.println(parsed.toString());
            uniqueAdd.add(parsed.toString());
        }
        
        return uniqueAdd.size();
    }
}