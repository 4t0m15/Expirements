public class BinaryNumberUponRequest {
    public static void ReturnBinaryNumberUponRequest(int limit, Queue<String> myQueue){
        myQueue.enqueue("1");
        for(int i= 0; i < limit; i++){
            String front = myQueue.dequeue();
            System.out.println(front);
            myQueue.enqueue(front + "0");
            myQueue.enqueue(front + "1");
        }
    }
    public static void main(String[] args){
        Queue<String> myQueue = new ArrayQueue<>();
        ReturnBinaryNumberUponRequest(99999999, myQueue);
    }
}