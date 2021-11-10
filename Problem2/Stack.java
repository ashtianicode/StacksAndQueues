package Problem2;

public interface Stack <E> {
    int size () ; // Returns the number of elements in the stack .
    boolean isEmpty () ; // Tests whether the stack is empty .
    void push ( E e) ; // Inserts an element at the top of the stack .
    E top () ; // Returns , but does not remove , the element at the top of the stack .
    E pop () ; // Removes and returns the top element from the stack .
}

class QueueStack<E> implements Stack<E> {

    public static final int CAPACITY=1000;
    private LinkedQueue<E> q1;
    private LinkedQueue<E> q2;
    private int size;

    public QueueStack() {
        q1 = new LinkedQueue<>();
        q2 = new LinkedQueue<>();
    }

    public int size() { return (t + 1); }
    public boolean isEmpty() { return (t == -1); }



    public void push(E e) throws IllegalStateException {
        // if ( size() == data.length) throw new IllegalStateException("Stack is full");
        // data[++t] = e;

        q1.enqueue(e);

    }

    public E top() {
        // if (isEmpty()) return null;
        // return data[t];
        return null;
    }

    public E pop() {
        // if (isEmpty( )) return null;
        // E answer = data[t];
        // data[t] = null;
        // t--;
        // return answer;

        // if the first queue is empty
        if (q1.isEmpty())
        {
            System.out.println("Stack Underflow!!");
            System.exit(0);
        }


        E front = null;
        while (!q1.isEmpty())
        {
            if (q1.size() == 1) {
                front = q1.first();
            }
            else {
                q2.enqueue(q1.first());
            }

            q1.dequeue();
        }


        while (!q2.isEmpty())
        {
            q1.enqueue(q2.first());
            q2.dequeue()
        }

        return front;
        
    }

}


