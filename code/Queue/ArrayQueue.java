

/* Implementation of the queue ADT using a fixed-length array. */

public class ArrayQueue<E> implements Queue<E> {
    public static final int CAPACITY = 1000;    //default array capacity
    
    //instance variables
    private E[] data;                           //generic array used for storage
    private int f = 0;                          //index of the front element
    private int sz = 0;                         //current number of elements

    //constructors
    public ArrayQueue() {this(CAPACITY);}
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }
    public void clear(){
    for(int i = 0; i < 995; i++){
        dequeue();
    }
    }
    //methods
    /* Returns the number of elements in the queue */
    public int size() { return sz; }

    /* Tests whetehre the queue is empty. */
    public boolean isEmpty() { return (sz == 0);}

    /* Inserts an element at the rear of the queue. */
    public void enqueue(E e) throws IllegalStateException {
        if(sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f+sz) % data.length;       //using modular arithmetic
        data[avail] = e;
        sz++;
    }

    /* Returns but does not remove, the first element of the queue (null if empty.) */
    public E dequeue() {
        if(isEmpty()) return null;
        E answer = data[f];
        data[f] = null;                         //dereference to aid in garbage collector collection
        f = (f+1) % data.length;
        sz--;
        return answer;        
    }
    public static void main(String[] args){
        Stack myStack = new ArrayStack<Integer>();
        Queue myQueue = new ArrayQueue<Integer>();
        Integer queueSize = myQueue.size();
        Integer stackSize = myStack.size();
        System.out.println(3);
        for(int i = -1; i < 100; i++){
            myQueue.enqueue(i);
        }
        System.out.println(2);
        for(int j = 0; j < stackSize; j++){
            myStack.push(myQueue.dequeue());
        }
        System.out.println(1);
        for(int l = 0; l < queueSize; l++){
            System.out.println(0);
            myQueue.enqueue(myStack.pop());
            System.out.println(l);
        }
    }
    @Override
    public E first() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'first'");
    }
    
    // public static void main(String[] args){
    //     ArrayQueue a = new ArrayQueue<Integer>();
    //     ArrayQueue b = new ArrayQueue<String>(50);
    // // try{    
    // //     for(int i = 0; i < 1001; i++){
    // //     a.enqueue(33);
    // //     }
    // // }
    // //     catch(Exception e){System.out.println("Queue is over capacity!!");}
    // //     System.out.println("Test");
    // //     for(int i = 0; i < 1001; i++){
    // //         a.dequeue();
    // //         }
    // a.enqueue(44);
    // a.enqueue(44);
    // a.enqueue(44);
    // a.enqueue(55);
    // System.out.println(a.first());
    // System.out.println(a.size());
    // for(int i = 0; i < 995; i++){
    // a.enqueue(33);
    // }
    // a.dequeue();
    // }
    // @Override
    // public E first() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'first'");
    // }
}