package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    -ilk giren elemanı ilk kullanmamız(FIFO) gerektiğinde Queue en iyi seçenektir

    -Queue da elemanlar "insertion order"a göre dizilirler

    -Queue'da peek(), poll(), element(), remove(), gibi ilk elemanı ilgilendiren bir çok metot vardır

    -offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.

      */

    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);

        /**
         * Inserts the specified element into this queue if it is possible to do
         * so immediately without violating capacity restrictions.
         * When using a capacity-restricted queue, this method is generally
         * preferable to {@link #add}, which can fail to insert an element only
         * by throwing an exception.
         *

         * @return {@code true} if the element was added to this queue, else
         *         {@code false}
         * @throws ClassCastException if the class of the specified element
         *         prevents it from being added to this queue
         * @throws NullPointerException if the specified element is null and
         *         this queue does not permit null elements
         * @throws IllegalArgumentException if some property of this element
         *         prevents it from being added to this queue
         */
        wareHouse.offer("Potatoes"); //Kapasite uygunsa ekleme yapar
        System.out.println(wareHouse);
    }
}
