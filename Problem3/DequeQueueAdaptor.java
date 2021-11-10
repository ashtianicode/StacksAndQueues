package Problem3;

public class DequeQueueAdaptor<E> extends DoublyLinkedListDeque<E>{
    
    private Deque<E> deque = new DoublyLinkedListDeque<E>();
    public DequeQueueAdaptor(){};

    public int size(){ return deque.size(); }
    public boolean isEmpty(){ return deque.isEmpty(); } 
    public void enqueue(E e) { deque.addLast(e); } 
    public E first() { return deque.first(); }
    public E dequeue() { return deque.removeFirst(); }
 
}

