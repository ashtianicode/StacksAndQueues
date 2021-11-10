package Problem1;

public class App {
    public static void main(String[] args){

        Queue<Integer> myqueue = new StackQueue<Integer>(10);
        System.out.println("size:" + myqueue.size());
        myqueue.enqueue(5);
        myqueue.enqueue(3);
        System.out.println("dequeue:" + myqueue.dequeue());
        myqueue.enqueue(7);
        System.out.println("dequeue:" + myqueue.dequeue());
        System.out.println("first:"+myqueue.first());
        System.out.println("dequeue:" + myqueue.dequeue());
        System.out.println("dequeue:" + myqueue.dequeue());
        System.out.println("size:" + myqueue.size());
        System.out.println("isEmpty:" + myqueue.isEmpty());
        myqueue.enqueue(9);
        myqueue.enqueue(7);
        System.out.println("size:" + myqueue.size());

        // Expected Output:
        // size:0
        // dequeue:5
        // dequeue:3
        // first:7
        // dequeue:7
        // dequeue:null
        // size:0
        // isEmpty:true
        // size:2

    }

}