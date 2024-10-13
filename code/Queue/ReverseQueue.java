

public class ReverseQueue{
    public static void main(String[] args){
        Stack myStack = new ArrayStack<Integer>();
        Queue myQueue = new ArrayQueue<Integer>();
        Integer queueSize = myQueue.size();
        Integer stackSize = myStack.size();
        for(int i = -1; i < 100; i++){
            myQueue.enqueue(i);
        }
        for(int j = 0; j < stackSize; j++){
            myStack.push(myQueue.dequeue());
        }
        for(int l = 0; l < queueSize; l++){
            myQueue.enqueue(myStack.pop());
            System.out.println(l);
        }
    }
}