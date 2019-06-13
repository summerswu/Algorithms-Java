no empty no linkedlist, represent two non neg int 

digit stored reverse order

234 = 432
356 = 653

1085

999 = 999
999 = 999

999
1
099
carrystate
0001



public linkedlist addInt(linkedlistOne, linkedListTwo){
	node1 = linkedlistone.head;
  node2 = linkedlisttwo.head;
  linkedlist ans = null;
  carrystate = null;
  
  while(node1.next!=null || node2.next !=null){
  	val = node1.value + node2.value
      if(carrystate = 1){
          val ++
          carrystate = 0
      }
    	if(val>9){
      	val = val%10
        carrystate = 1
      }
      
      node1.next;
      node2.next;
  }
  
  if carrystate == 1 ans.add(1);
  return ans
}