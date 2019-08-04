class Solution {
    public int totalFruit(int[] tree) {
        
        HashSet<Integer> basket = new HashSet<Integer>();
        HashMap<Integer, Integer> firstOccur = new HashMap<Integer,Integer>();
        int position = 0;
        int max = 0;
        int fruitCount = 0;
        
        while(position < tree.length){
            basket.add(tree[position]);
            firstOccur.putIfAbsent(tree[position],position);
            if(basket.size()<3){
                fruitCount++;
                position++;
                System.out.println(fruitCount);
            }
            else{
                position = position - 1;
                if(firstOccur.get(position)!=null)position = firstOccur.get(position);
                if(fruitCount>max) max = fruitCount;
                fruitCount = 0;
                basket.clear();
                System.out.println("maximum is" + max);
            }
        }
        
        if(fruitCount>max)max = fruitCount;
        return max;
    }
}