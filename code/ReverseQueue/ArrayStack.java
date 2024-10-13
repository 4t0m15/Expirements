public class ArrayStack<E> implements Stack<E>{
    public static final int CAPACITY = 1000;    //default array capacity
    private E[] data;                           //generic array used for storage
    private int t = -1;                         //index of the top element in stack
    public ArrayStack() {this(CAPACITY);}       //constructs stack with default capacity
    public ArrayStack(int capacity) { data = (E[]) new Object[capacity]; /* safe cast; compiler may give warning */ }  //constructs stack wth given capacity
    public int size() { return (t+1); } 
    public boolean isEmpty() { return ( t == -1); }
    public void push(E e) throws IllegalStateException { 
        if (size() == data.length) throw new IllegalStateException("Stack is full"); 
            data[++t] = e;                      //increment t before storing new term
    }
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }
    public E pop() {
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null;                         //dereference to aid in garbage collection
        t--;
        return answer;
    }
    // public static void main(String[] args) {
    //     ArrayStack<Integer> arraystack = new ArrayStack<>();
    //     arraystack.push(3);
    //     arraystack.push(5);
    //     arraystack.push(8);
    //     arraystack.pop();
    //     System.out.println(arraystack.size());
    // }
}
