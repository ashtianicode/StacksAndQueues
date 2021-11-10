package Problem3;

public class App {
    public static void main(String[] args){

        DequeQueueAdaptor<Integer> myqueue = new DequeQueueAdaptor<Integer>();
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


        System.out.println("// ----------------------------------------------------------------");


        DequeStackAdaptor<Integer> mystack = new DequeStackAdaptor<Integer>();
        System.out.println("size:" + mystack.size());
        mystack.push(5);
        mystack.push(3);
        System.out.println("size:" + mystack.size());
        
        System.out.println("pop:" + mystack.pop());
        System.out.println("isEmpty:" + mystack.isEmpty());
        System.out.println("pop:" + mystack.pop());
        System.out.println("isEmpty:" + mystack.isEmpty());
        System.out.println("pop:" + mystack.pop());

        mystack.push(7);
        mystack.push(9);
        System.out.println("top:"+mystack.top());
        
        mystack.push(4);
        System.out.println("size:" + mystack.size());
        System.out.println("pop:" + mystack.pop());

        mystack.push(6);
        mystack.push(8);
        System.out.println("pop:" + mystack.pop());

        
        // Expected Output:
        // size:0
        // size:2
        // pop:3
        // isEmpty:false
        // pop:5
        // isEmpty:true
        // pop:null
        // top:9
        // size:3
        // pop:4
        // pop:8



    }

}