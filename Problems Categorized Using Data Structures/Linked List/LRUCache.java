class LRUCache {

     class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
     }

      private void addNode(DLinkedNode node) {
        /**
         * Always add the new node right after head.
         */
        node.prev = head;//head comes before node
        node.next = head.next;//the next of node, is the original next of head

        head.next.prev = node;//conversely
        head.next = node;
          
      }

      private void removeNode(DLinkedNode node){
        /**
         * Remove an existing node from the linked list.
         */
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
          
      }

      private void moveToHead(DLinkedNode node){
        /**
         * Move certain node in between to the head.
         */
        removeNode(node);
        addNode(node);
          
      }

      private DLinkedNode popTail(){
        DLinkedNode res = tail.prev;
        removeNode(res);
        System.out.println(res.value);
        return res;
      }
    
        private int size;
        private int capacity;
        private DLinkedNode head, tail;
    
        private Map<Integer, DLinkedNode> map = new HashMap<Integer, DLinkedNode>();
      
        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;

            head = new DLinkedNode();
            // head.prev = null;

            tail = new DLinkedNode();
            // tail.next = null;

            head.next = tail;
            tail.prev = head;
          }

        public int get(int key){
            
            if(map.containsKey(key)){
                
                moveToHead(map.get(key));
                return map.get(key).value;
                
            }
            return -1;
        }
    
        public void put(int key, int value){
            
            DLinkedNode node = map.get(key);
            
            if(node == null){
                  DLinkedNode newNode = new DLinkedNode();
                  newNode.key = key;
                  newNode.value = value;

                  map.put(key, newNode);
                  addNode(newNode);
                
                size++;
                
                if(size > capacity){
                    DLinkedNode tail = popTail();
                    map.remove(tail.key);
                    --size;
                }
            } else {
              // update the value.
                  node.value = value;
                  moveToHead(node);
                }
        }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */