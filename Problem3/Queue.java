package Problem3;

public interface Queue<E> {
    int size () ; // Returns the number of elements in the queue .
    boolean isEmpty () ; // Tests whether the queue is empty .
    void enqueue (E e); // Inserts an element at the rear of the queue .
    E first () ; // Returns , but does not remove , the first element of the queue .
    E dequeue () ; // Removes and returns the first element of the queue .
}


class DequeQueue<E> implements Queue<E>{
    
    private DoublyLinkedList<E> queue = new DoublyLinkedList<>();
    public DequeQueue(){};

    public int size(){ return queue.size(); }
    public boolean isEmpty(){ return queue.isEmpty(); } 
    public void enqueue(E e) { queue.addLast(e); } 
    public E first() { return queue.first(); }
    public E dequeue() { return queue.removeFirst(); }

}

