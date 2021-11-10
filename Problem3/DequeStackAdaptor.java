package Problem3;

public class DequeStackAdaptor<E> extends DoublyLinkedListDeque<E>{

    private Deque<E> deque = new DoublyLinkedListDeque<E>();
    public DequeStackAdaptor(){};

    public int size() { return deque.size(); }
    public boolean isEmpty() { return deque.isEmpty(); }
    public void push(E e) {deque.addFirst(e); }

    public E top() {
        if (deque.isEmpty()) return null;
        return deque.first();
    }

    public E pop() {
        if (deque.isEmpty()) return null;
        return deque.removeFirst();
    }

}