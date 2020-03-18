package collections.list;

import java.util.Objects;

// Doubly-Linked list
public class MyLinkedList<E> {
    private int size;
    private Node head, tail;

    private static class Node<E> {
        E data;
        Node next;
        Node prev;
        Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(E data) {
        Node<E> myNode = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(myNode.data, data)) {
                return true;
            }
            //move to the next one
            myNode = myNode.next;
        }
        return false;
    }

    public void add(E data) {
        if(size != 0){
            Node newNode = new Node<E>(data,null,tail);
            tail.next = newNode;
            tail = newNode;
        }else{
            head = new Node<E>(data, null, null);
            tail = head;
        }
        size++;
    }

    public void add(int i, E data) {
        if (i == size) {
            add(data);
        } else {
            Node currentNode = get(i);
            Node newNode = new Node<E>(data, currentNode, currentNode.prev);
            if (currentNode.prev != null) {
                currentNode.prev.next = newNode;
            }
            currentNode.prev = newNode;
            if (i == 0) {
                head = newNode;
            }
            size++;
        }
    }

    public E remove(int i) {
        Node myNode = get(i);
        size--;
        if (myNode.prev == null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            myNode.prev.next = myNode.next;
        }
        if (myNode.next == null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            myNode.next.prev = myNode.prev;
        }
        return (E) myNode.data;
    }

    public Node get(int i) {
        Node<E> currentNode = head;
        for (int j = 0; i < i; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public E set(int i, E newData) {
        Node<E> node = get(i);
        E old = node.data;
        node.data = newData;
        return old;
    }

    @Override
    public String toString() {
        // TODO
        // ex) "Obj0"=="Obj1"==null
        return super.toString();
    }
}
