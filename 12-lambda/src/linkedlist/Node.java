package linkedlist;

/**
 * A Node object is a pair, consists of an Object reference, and another Node reference.
 * So Node objects can gather as a chain, such that each one keeps a reference to the
 * next Node in the chain. A LinkList object can hold and maintain such chain.
 */
class Node<T> {
    /** Object of this node */
    private T object;

    /** Reference to the next node in the chain, null when this is the last node. */
    private Node<T> next;

    /**
     * Creates new Node object, with given Object, next is null until explicitly set
     * by setNext().
     * @param object Object of this Node
     */
    Node(T object) {
        this.object = object;
        this.next = null;
    }

    /**
     * Creates new Node object, with given Object and Node objects.
     * @param object Object of this Node
     * @param next next Node of this Node in the chain
     */
    Node(T object, Node<T> next) {
        this.object = object;
        this.next = next;
    }

    /**
     * @return Object of this node
     */
    T getObject() {
        return this.object;
    }


    /**
     * @return Next node in the chain, or null if this is the last node in the chain.
     */
    Node<T> getNext() {
        return this.next;
    }

    /**
     * Set next node of this node
     * @param next next node
     */
    void setNext(Node<T> next) {
        this.next = next;
    }


    /**
     * Whether this is the last node in the chain, i.e. this.next is null.
     * @return true if this is the last node, false otw.
     */
    boolean isLast() {
        return (this.next == null);
    }
}
