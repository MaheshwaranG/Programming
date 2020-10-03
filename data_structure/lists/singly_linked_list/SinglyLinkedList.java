import java.lang.*;
import java.util.Objects;

public class SinglyLinkedList {
    public static void main(String arg[]) {
        LinkedList ll = new LinkedList();
        ll.addToFront(10);
        ll.addToFront(11);
        ll.addToFront(12);
        ll.addToFront(13);
        ll.addByTail(14);
        ll.addToFront(15);
        ll.addToFront(16);
        ll.add(17);
        ll.addByTail(18);
        ll.addByTail(20);
        ll.addByTail(19);

        ll.printList();
        System.out.println(ll.remove(12));
        ll.printList();
        System.out.println(ll.remove(120));
        ll.printList();
        System.out.println(ll.remove(10));
        System.out.println(ll.remove(10));
        System.out.println(ll.remove(19));
        ll.printList();
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
    }

    void addToFront(int data) {
        Node next = new Node(data);
        if (head != null) {
            next.setNext(head);
            head = next;
        } else {
            head = next;
            tail = next;
        }

    }

    void addByTail(int data) {
        Node next = new Node(data);
        if (Objects.isNull(tail)) {
            head = next;
            tail = next;
        }
        tail.setNext(next);
        tail = next;
    }

    void add(int data) {
        Node next = new Node(data);
        Node current = head;
        if (Objects.isNull(head)) {
            head = next;
            return;
        }
        while (Objects.nonNull(current.getNext())) {
            current = current.getNext();
        }
        current.setNext(next);
        tail = next;
    }

    int remove(int data) {
        Node current = head;
        int index = 0;
        if (Objects.nonNull(head)) {
            if (head.getData() == data) {
                head = head.getNext();
                return index;
            }
        } else {
            System.out.println("List is empty");
            return -1;
        }
        while (Objects.nonNull(current.getNext())) {
            index++;
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                return index;
            }
            current = current.getNext();
        }
        System.out.print("element " + data + " not found to remove from list");
        return -1;
    }

    void printList() {
        Node current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null ");
    }
}

class Node {
    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node data(int data) {
        this.data = data;
        return this;
    }

    public Node next(Node next) {
        this.next = next;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return data == node.data && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "{" + " data='" + getData() + "'" + ", next='" + getNext() + "'" + "}";
    }

}