package Problem2;

public interface Queue<E> {
    int size () ; // Returns the number of elements in the queue .
    boolean isEmpty () ; // Tests whether the queue is empty .
    void enqueue (E e); // Inserts an element at the rear of the queue .
    E first () ; // Returns , but does not remove , the first element of the queue .
    E dequeue () ; // Removes and returns the first element of the queue .
}


// Realization of a FIFO queue as an adaptation of a SinglyLinkedList. 
class LinkedQueue<E> implements Queue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedQueue() { } 
    public boolean isEmpty() { return list.isEmpty(); } 
    public int size() { return list.size(); }
    public void enqueue(E element) { list.addLast(element); } 
    public E first() { return list.first(); }
    public E dequeue() { return list.removeFirst(); }
}

