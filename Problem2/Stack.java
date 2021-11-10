package Problem2;

public interface Stack <E> {
    int size () ; // Returns the number of elements in the stack .
    boolean isEmpty () ; // Tests whether the stack is empty .
    void push ( E e) ; // Inserts an element at the top of the stack .
    E top () ; // Returns , but does not remove , the element at the top of the stack .
    E pop () ; // Removes and returns the top element from the stack .
}

class QueueStack<E> implements Stack<E> {

    private LinkedQueue<E> q1;
    private LinkedQueue<E> q2;
    private int size;

    public QueueStack() {
        q1 = new LinkedQueue<E>();
        q2 = new LinkedQueue<E>();
    }

    public int size() { return q1.size(); }
    public boolean isEmpty() { return ( q1.size() == 0); }


    public void push(E e) {
        
        q1.enqueue(e);
        size ++;

    }

    public E top() {
        if (q1.isEmpty())
        {
            return null;
        }

        // move everything from q1 to q1, but also keep the last one from q1 to return later
        E front = null;
        while (!q1.isEmpty())
        {
            if (q1.size() == 1) {
                front = q1.dequeue();
                q2.enqueue(front);

            }
            else {
                q2.enqueue(q1.dequeue());
            }
        }

        // keep moving everything back from q2 to q1
        while (!q2.isEmpty())
        {
            q1.enqueue(q2.dequeue());
        }

        // return 
        return front;

    }



    public E pop() {
        
        if (q1.isEmpty())
        {
            return null;
        }

        // keep moving to q2 until there's only the last one left in q1
        E front = null;
        while (!q1.isEmpty())
        {
            if (q1.size() == 1) {
                front = q1.dequeue();
                // q2.enqueue(front);

            }
            else {
                q2.enqueue(q1.dequeue());
            }
        }

        // keep moving everything back from q2 to q1
        while (!q2.isEmpty())
        {
            q1.enqueue(q2.dequeue());
        }

        // return 
        return front;

    }

}


