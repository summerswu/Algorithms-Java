//implementation of the queue data structure 

class Queue{
	private List<Integer> data;
	private int p_start;

	public Queue(){
		data = new ArrayList<Integer>();
		p_start = 0;
	}

	public enQueue(int x){
		data.add(x);
		return true;
	}

	/*public deQueue(){
		if(isEmpty() == true){
			return false;
		}

		data.remove(p_start);
		return true;
	}*/

	//Doesn't the official way of doing it mess up the 

	 public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

	 public int Front() {
        return data.get(p_start);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }     
}
