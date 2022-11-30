package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        System.out.println(myList);//[Z, K, A, J, M]

        //EX-1 : Iterators kullşanarak list elemanlarını tersten ekrana yazdırınız
        ListIterator<String> itr = myList.listIterator();

        //hasNext() method'u pointer dan sonra eleman varsa "true", yoksa "false" return eder.
        //next() method'u pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.

        while (itr.hasNext()) {
            itr.next(); //pointer'a en sağa aldık
        }

         //hasPrevious() method'u pointer dan once eleman varsa "true", yoksa "false" return eder.
        //previous() method'u pointer'i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani return eder.

        while (itr.hasPrevious()) {
            String eleman = itr.previous();
            System.out.print(eleman + " ");
        }

        //EX-2 : Listteki tüm elemanları siliniz
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(myList);

        /*
            1) ListIterator da i)hasNext() ii)next() ii)set() iv)hasPrevious() v)previous() vi)remove() method'lari vardir.

            2) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.
        */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while(iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el);
        }
    }
}
