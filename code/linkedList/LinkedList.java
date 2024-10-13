public class LinkedList<E>{
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n){
            next = n;
        }
    }

    public static class SinglyLinkedList<E> {
        private Node<E> head = null;
        private Node<E> tail = null;
        private int size = 0;

        public SinglyLinkedList(){
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public E first() {
            if (isEmpty()) return null;
            return head.getElement();
        }

        public E last() {
            if(isEmpty()) return null;
            return tail.getElement();
        }

        public void addFirst(E e) {
            head = new Node<>(e, head);
            if(size == 0){
                tail = head;
            }
            size++;
        }

        public void addLast(E e) {
            Node<E> newest = new Node<>(e, null);
            if(isEmpty())
                head = newest;
            else
                tail.setNext(newest);
            tail = newest;
            size++;
        }

        public E removeFirst() {
            if(isEmpty())
                return null;
            E answer = head.getElement();
            head = head.getNext();
            size--;
            if(size == 0)
                tail = null;
            return answer;
        }
        public void addAtIndex(int index, E element){
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            if(index == 0) {
                addFirst(element);
                return;
            }
            if(index == size) {
                addLast(element);
                return;
            }
            Node<E> current = head;
            for(int i = 0; i < index -1; i++)
            {
                current = current.getNext();
            }
            Node<E> newNode = new Node<>(element, current.getNext());

        }
        public E removeLast() {
            if (isEmpty()) {
                return null;
            }
            if (size == 1) {
                return removeFirst();
            }
            Node<E> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            E element = tail.getElement();
            tail = current;
            tail.setNext(null);
            size--;
            return element;
        }
        
        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getElement();
        }
        public boolean contains(E element) {
            Node<E> current = head;
            while(current != null){
                if (element.equals(current.getElement())){
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
        public String toString() {
            Node<E> current = head;
            String total = "";
            while(current != null){
                total += current.getElement();
                current = current.getNext();
                total += "-->";
            }
            total+="null";
            System.out.println(total);
            return "";
        }

        public void clear(){
            head = null;
            tail = null;
            size = 0;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        //Adding elements to list
        list.addFirst(10);
        list.addLast(20);

        //test toString function
        System.out.println("--------------");
        list.toString();
        System.out.println("--------------");

        //Print size of the list
        System.out.println("Size of the list: " + list.size());

        //Check for element 20 with .contains method
        System.out.println(list.contains(20));

        //Print first and last elements
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        //Removing first element and printing it
        System.out.println("Removing it: " + list.removeFirst());

        //Print size of the list after removal
        System.out.println("Size of the list after removal: " + list.size());

        //Print first and last elements after removal
        System.out.println("First element after remove: " + list.first());
        System.out.println("Last element after remove: " + list.last());

        //testing toString method
        list.addFirst(10000);
        list.addLast(200);
        list.removeFirst();
        list.addAtIndex(2, 999999);
        list.toString();

        //testing clear method
        list.clear();
        list.toString();
    }
}