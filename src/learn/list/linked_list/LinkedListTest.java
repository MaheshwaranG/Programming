package learn.list.linked_list;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add(1, "b");
        list.addFirst("0");
        list.addLast("9");

        System.out.println("peek " + list.peek()); // returns first element and does not remove element
        System.out.println("Poll " + list.poll()); // returns first element and remove element
        System.out.println("peekLast " + list.peekLast());
        System.out.println("pollLast : " + list.pollLast());
        System.out.println("Pop :" + list.pop()); // it like as removeFirst
        list.offer("c"); // adds end of the list
        System.out.println("element : " + list.element()); // returns first element like peek
        list.offerFirst("A");
        list.addLast("100");
        list.push("Z");
        list.addFirst("100");

        System.out.println();

        Iterator<String> iter = list.listIterator();
        for (String s : list) {
            // list can be loop by for-each
        }
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(list.toString());
    }
}