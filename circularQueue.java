//of course the previous method is shit because it waste space

class MyCircularQueue {

    private int[] data;
	private int tail;
	private int head;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = 0;
        tail = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
       if(this.isFull())return false;
        
        if((tail + 1) >= data.length){
            tail = 0;
        }
        else tail++;
        data[tail] = value;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(this.isEmpty()){
            return false;
        }
            
        data[head] = 0;
        
        if(head + 1 >= data.length){
            head = 0;
        }
        
        else head++;
        
        if(tail==head && this.isEmpty()){
             head = 0;
             tail = 0;
        }
        
        return true;
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return data[0];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return data[data.length];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(tail==head)return true;
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        for(int i = 0; i<data.length; i++){
            if (data[i] != 0){
                return false;
            }
        }
        
        return true;
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