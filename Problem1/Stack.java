package Problem1;

public interface Stack <E> {
    int size () ; // Returns the number of elements in the stack .
    boolean isEmpty () ; // Tests whether the stack is empty .
    void push ( E e) ; // Inserts an element at the top of the stack .
    E top () ; // Returns , but does not remove , the element at the top of the stack .
    E pop () ; // Removes and returns the top element from the stack .
}

class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY=1000;
    private E[ ] data;
    private int t = -1;

    public ArrayStack() { this(CAPACITY); }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() { return (t + 1); }
    public boolean isEmpty() { return (t == -1); }



    public void push(E e) throws IllegalStateException {
        if ( size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    public E pop() {
        if (isEmpty( )) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

}