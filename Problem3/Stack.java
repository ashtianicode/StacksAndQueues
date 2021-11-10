package Problem3;

public interface Stack <E> {
    int size () ; // Returns the number of elements in the stack .
    boolean isEmpty () ; // Tests whether the stack is empty .
    void push ( E e) ; // Inserts an element at the top of the stack .
    E top () ; // Returns , but does not remove , the element at the top of the stack .
    E pop () ; // Removes and returns the top element from the stack .
}

class DequeStack<E> implements Stack<E> {

    private static Deque<E> deque = new Deque<E>();
    public DequeStack(){};


    public int size() { return deque.size(); }
    public boolean isEmpty() { return deque.isEmpty(); }


    public void push(E e) throws IllegalStateException {
        // if ( size() == data.length) throw new IllegalStateException("Stack is full");
        deque.addFirst(e);
    }

    public E top() {
        if (deque.isEmpty()) return null;
        return deque.first();
    }

    public E pop() {
        if (deque.isEmpty()) return null;
        return deque.removeFirst();
        
    }

}