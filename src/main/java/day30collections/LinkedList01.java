package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        /**
         * Retrieves, but does not remove, the head (first element) of this list.
         * @return the head of this list, or {@code null} if this list is empty

        Listedeki ilk lelemanı silmeden sana verir. Boş kullanuılırsa exception vermez,
        "null"verir.
         */
        String firstEl = names.peek();
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        LinkedList<String> myList = new LinkedList<>();
        System.out.println(myList.peek());//null

        String firstElement = names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /**
         Retrieves, but does not remove, the head (first element) of this list.
         @throws NoSuchElementException if this list is empty
         */
        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        names.peekFirst(); // ==> peek() ile aynı

        // SORU-1: "A" ile başlayan tüm isimleri *'e çeviriniz
        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        System.out.println(students);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for (String w : students) {
            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");
            }
        }
        System.out.println(students);

        // SORU-2 : Listteki 4 harften çok harf içeren isimleri siliniz

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).length() > 4) {
                students.remove(students.get(i));
                i--;
            }

        }System.out.println(students);//[Mark, Tom, Hans]
    }
}