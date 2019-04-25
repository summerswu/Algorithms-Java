class MyCircularQueue {

    private int[] data;
	private int tail;
	private int head;
    private int length;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        length = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
       if(this.isFull())return false;
        
        tail = (tail+1) % data.length;//
        data[tail] = value;
        length++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(this.isEmpty()) return false;

        head = (head+1) % data.length;
        data[head] = 0;
        length--;
        return true;
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(this.isEmpty()) return -1; 
        return data[head+1];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(this.isEmpty())return -1;            
        return data[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(length==0)return true;
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       if(length==data.length)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */class MyCircularQueue {

    private int[] data;
	private int tail;
	private int head;
    private int length;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        length = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
       if(this.isFull())return false;
        
        tail = (tail+1) % data.length;//
        data[tail] = value;
        length++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(this.isEmpty()) return false;

        head = (head+1) % data.length;
        data[head] = 0;
        length--;
        return true;
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(this.isEmpty()) return -1; 
        return data[head+1];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(this.isEmpty())return -1;            
        return data[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(length==0)return true;
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       if(length==data.length)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */