public class SinglyLinkedList<T> {
    private static class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList() {}

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public T last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(T element) {
        head = new Node<>(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void addAtIndex(int index, T element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(element, current.getNext());
        current.setNext(newNode);
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getElement()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        // Adding elements to list
        list.addFirst(10);
        list.addLast(20);

        // Test toString function
        System.out.println("--------------");
        System.out.println(list.toString()); // Print the toString result
        System.out.println("--------------");

        // Print size of the list
        System.out.println("Size of the list: " + list.size());

        // Check for element 20 with .contains method
        System.out.println(list.contains(20));

        // Print first and last elements
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        // Removing first element and printing it
        System.out.println("Removing it: " + list.removeFirst());

        // Print size of the list after removal
        System.out.println("Size of the list after removal: " + list.size());

        // Print first and last elements after removal
        System.out.println("First element after remove: " + list.first());
        System.out.println("Last element after remove: " + list.last());