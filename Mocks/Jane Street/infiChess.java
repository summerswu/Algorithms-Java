class chessBoard{
  
   HashMap<Integer, ArrayList<Character>> map  =  new HashMap<Integer,   ArrayList<Character>>();
   int factor;
   public chessBoard(int thisFactor){
     this.factor = thisFactor;
   }
  
   public boolean insert(int column, char color){
     /*
     ArrayList<Character> holder = new ArrayList<Character>();
     holder = map.get(column);
     holder.add(color);
     map.put(column, holder);*/
     
     checkWin(column, color);
     this.map.putIfAbsent(column, new ArrayList<Character>());
     this.map.get(column).add(color);
     
     if (map.get(column) == null){
         ArrayList<Character> holder = new ArrayList<Character>();
         holder.add(color);
         map.put(column, holder);
     }
     
     else {
        map.out(column, map.get(column).add(color));
     }
       
     return true;
   } 
  
   public boolean checkWin(int column, char color){
     
     if(map.get(column).size() < this.factor) return false;
     for(int i = 1; i <= f; i++){
       if(map.get(column).get(map.get(column).size()-i) != color) return false; 
     }
     
     return true;
   }
  
   public boolean checkHWin(int column, char color){
     
     int size = map.get(column).size();
     int counterL = 1;
     int counterR = 1;
     boolean hit = false;
     
     while(hit == false){
       if(map.get(column+counterR).get(size) == color) counterR++;
       else hit = true;
     }
     hit = false;
     while(hit == false){
       if(map.get(column-counterL).get(size) == color) counterL++;
       else hit = true;
     }
     
     if(counterL+counterR+1 < this.factor) return false;
     
     return true;
   }
}
