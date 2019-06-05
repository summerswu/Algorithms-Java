class MyLinkedList {

    /** A very simple node class. */
    private static class Node {
        int val;
        Node next;
    }

    // Predecessor of the first element
    private Node headPred;
    // Predecessor of the tail
    private Node tailPred;
    private int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        headPred = new Node();
        tailPred = headPred;
        length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if ((index < 0) || (index >= length)) {
            return -1;
        }
        return findPred(index).next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (length == 0) {
            addAtTail(val);
        } else {
            addAfter(headPred, val);
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAfter(tailPred, val);
        tailPred = tailPred.next;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else if ((index >= 0) && (index < length)) {
            addAfter(findPred(index), val);
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if ((index >= 0) && (index < length)) {
            Node pred = findPred(index);
            if (index == length - 1) { // Remove last element
                // Move tail to the left
                tailPred = pred;
            }
            pred.next = pred.next.next;
            --length;
        }
    }

    /** Return the predecessor of the index-th node. */
    private Node findPred(int index) {
        Node pred = headPred;
        for (int i = 0; i < index; ++i) {
            pred = pred.next;
        }
        return pred;
    }

    /** Add an element after the given node. */
    private void addAfter(Node pred, int val) {
        Node node = new Node();
        node.val = val;
        node.next = pred.next;
        pred.next = node;
        ++length;
    }
}