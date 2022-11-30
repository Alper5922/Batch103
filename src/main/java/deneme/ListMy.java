package deneme;

import java.util.LinkedList;
import java.util.Queue;

public class ListMy {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        System.out.println(linkedList);

        System.out.println(linkedList.poll());

        System.out.println(linkedList);
    }
}
