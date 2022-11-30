package day29abstractioncollections;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedList01 {
    /*
    ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
     Cunku bircok elemanin re-index edilmesi gerekir.

     LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden eleman ekleme ve eleman silme islemlerini
     cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

     1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
     2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
     3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
     4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
     5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
     6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
     7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */

    public static void main(String[] args) {
        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        System.out.println(visitors); //[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.add(2,"Angelina Julie");
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        //Linkedistler ekleme ve çıkarma işlemlerinde başarılı olduklarından ekleme ve silme ile ilgili çokfazla metot vardır
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkın");
        System.out.println(visitors);//[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);//[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirst();
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]


        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors); // [Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

        /**
         * removes and returns the first element of this list.
         *
         * <p>This method is equivalent to {@link #removeFirst()}.
         */
        // pop()==> ilk elemanı verir ve siler.
        String firstEl = visitors.pop(); // cut + paste == > yapar
        System.out.println(firstEl); // Tom
        System.out.println(visitors);//[Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String> myList = new LinkedList<>();
        // pop() ==> boş linList de kullanılırsa exception atar
        //   myList.pop(); // NoSuchElementException attı çünkü linkList boş

    }

}
