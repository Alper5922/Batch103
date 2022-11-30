package day30collections;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque01 {

    /*
    Deque : Double Ended Queue (İki uçlu sıra)
    FIFO ve LIFO beraber gerektiğinde kullanılır.

    metotları hep iki uçlu--> xxxxFirst()   xxxxLast()

     */

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);//[Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        furnitureTruck.push("Deneme"); // addFirst() metodu ile aynı
        System.out.println(furnitureTruck);
    }
}
