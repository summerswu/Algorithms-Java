 class MyHashMap {
        final ListNode[] nodes = new ListNode[10000];//listnode array of 10000

        public void put(int key, int value) {
            int i = idx(key);//hash the key using the simple hash function
            if (nodes[i] == null)//if the node at this spot is null
                nodes[i] = new ListNode(-1, -1);//creade a node here with these default values
            ListNode prev = find(nodes[i], key);//find the previous nodes here and see where the latest node is at
            if (prev.next == null)//if the next of the last one is null, 
                prev.next = new ListNode(key, value);//create new node with these values
            else {
                prev.next.val = value;
                prev.next.key = key;
            };//else, just set the values like this
        }

        public int get(int key) {
            int i = idx(key);//has the key
            if (nodes[i] == null)
                return -1;
            ListNode node = find(nodes[i], key);
            return node.next == null ? -1 : node.next.val;
        }

        public void remove(int key) {
            int i = idx(key);
            if (nodes[i] == null) return;
            ListNode prev = find(nodes[i], key);
            if (prev.next == null) return;
            prev.next = prev.next.next;
        }//both very intuitive methods, very fool proof

        int idx(int key) { return Integer.hashCode(key) % nodes.length;}//this is the hashing function 

        ListNode find(ListNode bucket, int key) {
            ListNode node = bucket, prev = null;
            while (node != null && node.key != key) {
                prev = node;
                node = node.next;
            }
            return prev;//return the latest node if there is no match for this key, return the node before node next if there is
        }

        class ListNode {//defining a list node class that's unique to this 
            int key, val;
            ListNode next;

            ListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
    }
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */