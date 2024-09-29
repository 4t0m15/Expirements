// import java.lang.reflect.Constructor;

// import org.w3c.dom.Node;
// //what is this?

// public class DoublyLinkedList<E>{
//     /** A basic doubly linked list implementation */
//     //--------------------nested Node class--------------------
//     private static class Node<E> {
//         private E element;
//         private Node<E> prev;
//         private Node<E> next;
        
//         public Node(E e, Node<E> p, Node<E> n) {
//             element = e;
//             prev = p;
//             next = n;
//         }

//         public E getElement() { return element; }
//         public Node<E> getPrev() { return prev; }
//         public Node<E> getNext() { return next; }
//         public void setPrev(Node<E> p) { prev = p; }
//         public void setNext(Node<E> n) { next = n; }
//     }

//     // Instance variables of the DoublyLinkedList
//     private Node<E> header;
//     private Node<E> trailer;
//     private int size = 0;

//     // Constructs a new empty list.
//     public DoublyLinkedList() {
//         header = new Node<>(null, null, null);
//         trailer = new Node<>(null, header, null);
//         header.setNext(trailer);
//     }

//     // Returns the number of elements in the linked list.
//     public int size() { return size; }

//     // Tests whether the linked list is empty.
//     public boolean isEmpty() { return size == 0; }

//     // Returns but does not remove the first element of the list
//     public E first() {
//         if (isEmpty()) { 
//             return null; 
//         }
//         return header.getNext().getElement();
//     }

//     // Adds element e to the front of the list
//     public void addFirst(E e) {
//         addBetween(e, header, header.getNext());
//     }

//     // Adds element e to the end of the list
//     public void addLast(E e) {
//         addBetween(e, trailer.getPrev(), trailer);
//     }

//     // Removes and returns the first element
//     public E removeFirst() {
//         if (isEmpty()) return null;
//         return remove(header.getNext());
//     }

//     // Adds an element e between the given nodes
//     private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
//         Node<E> newNode = new Node<>(e, predecessor, successor);
//         predecessor.setNext(newNode);
//         successor.setPrev(newNode);
//         size++;
//     }

//     // Removes the given node and returns its element
//     private E remove(Node<E> node) {
//         Node<E> predecessor = node.getPrev();
//         Node<E> successor = node.getNext();
//         predecessor.setNext(successor);
//         successor.setPrev(predecessor);
//         size--;
//         return node.getElement();
//     }
// }
// // Constructor Name: Changed public void DoublyLinkedList() to public DoublyLinkedList().
// // Instance Variable Initialization: Made trailer an instance variable, and initialized it properly in the constructor.
// // Syntax Corrections: Added a missing closing brace for the first() method.
// // Method Definitions: Implemented addBetween and remove methods, which are essential for the list operations.
// // Consistent Naming and Correct Syntax: Ensured method names and variable names are consistent and correctly referenced.
import java.lang.reflect.Constructor;
public class newCode {

//what is this?
    /** A basic doubly linked list implementation */
    //--------------------nested Node class--------------------
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() { return element; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        public void setPrev(Node<E> p) { prev = p; }
        public void setNext(Node<E> n) { next = n; }
    }

    // Instance variables of the DoublyLinkedList
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    // Constructs a new empty list.
    public void DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    // Returns the number of elements in the linked list.
    public int size() { return size; }

    // Tests whether the linked list is empty.
    public boolean isEmpty() { return size == 0; }

    // Returns but does not remove the first element of the list
    public E first() {
        if (isEmpty()) { 
            return null; 
        }
        return header.getNext().getElement();
    }

    // Adds element e to the front of the list
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    // Adds element e to the end of the list
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    // Removes and returns the first element
    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    // Adds an element e between the given nodes
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node<>(e, predecessor, successor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }

    // Removes the given node and returns its element
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}
