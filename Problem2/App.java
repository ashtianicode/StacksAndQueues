package Problem2;

public class App {
    public static void main(String[] args){

        QueueStack<Integer> mystack = new QueueStack<Integer>();
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