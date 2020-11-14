package linkedlist;

class Node<E> {
    public E data;
    public  Node prev;
    public Node next;

    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
