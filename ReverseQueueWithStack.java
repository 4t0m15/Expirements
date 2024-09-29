

public class ReverseQueueWithStack {
    public static void reverseQueue(ArrayQueue<Character> myQueue){
        ArrayStack<Character> myStack = new ArrayStack<>();
        for(int i = 0; i<= myQueue.size(); i++){
            Character character0 = myQueue.dequeue();
            myStack.push(character0);
        }
        for(int j = 0; j < myStack.size(); j++){
            myQueue.enqueue(myStack.pop());
        }
    }
    public static void main(String[] args){
        ArrayQueue<Integer> myQueue = new ArrayQueue<>();
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        
        //fix later
        //reverseQueue(myQueue);
    }
}
