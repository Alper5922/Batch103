package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    /*
    Javanın kendisine göre belirlediği bir önceliğe göre sıralar.
    Biz istersek siralamayi belirleyebiliriz

     */
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        System.out.println(myQueue);//[A, C, B, G, E]
    }
}
