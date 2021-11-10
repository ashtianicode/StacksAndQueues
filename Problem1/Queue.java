package Problem1;

import java.security.DrbgParameters.Capability;

public interface Queue<E> {
    int size () ; // Returns the number of elements in the queue .
    boolean isEmpty () ; // Tests whether the queue is empty .
    void enqueue (E e); // Inserts an element at the rear of the queue .
    E first () ; // Returns , but does not remove , the first element of the queue .
    E dequeue () ; // Removes and returns the first element of the queue .
}



class StackQueue<E> implements Queue<E> {

    public static final int CAPACITY=1000;
    private ArrayStack<E> inbox;
    private ArrayStack<E> outbox;
    private int size;

    public StackQueue( ) {this(CAPACITY);}
    
    public StackQueue(int capacity) {
        inbox = new ArrayStack<E>(capacity);
        outbox = new ArrayStack<E>(capacity);
    
    }

    public int size() { return size; }
    public boolean isEmpty() { return ( size == 0); }


    public void enqueue(E e) throws IllegalStateException {
        if (CAPACITY == inbox.size()) throw new IllegalStateException("Queue is full");
        inbox.push(e);
        size++;
    }   
    
    public E first( ) {
        if (inbox.isEmpty()){
            while (!outbox.isEmpty()) {
                inbox.push(outbox.pop());
            }
        }
        E temp = null;
        if(!inbox.isEmpty()) {
            temp = inbox.top();
        }
        return temp;
    }
    

    
    public E dequeue( ) {
        if (outbox.isEmpty()){
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        E temp = null;
        if(!outbox.isEmpty()) {
            temp = outbox.pop();
            size--;
        }
        return temp;
    }



}


