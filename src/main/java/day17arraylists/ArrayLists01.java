package day17arraylists;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names); //[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        // removeAll();----> Saddece ilk list değişir. Parantezin içindeki list değişmez
        names.removeAll(cities);

        System.out.println(names); //[Thomas, Tahsin]
        System.out.println(cities); //[Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();

        names.add("Thomas");
        names.add("Tahsin");

        // containsAll() ----> Bir listin içindeki çoklu elemanları var olu olmadığını kontrol eder
        // Hepsi varsa TRUE, en az biri yoksa false verir
        boolean sonuc1 = names.containsAll(myNames);
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //SORU -1) "a" listinde "Shoes" elemanınınilk görünümünü siliniz
        a.remove("Shoes");
        System.out.println(a); //[TV, Radio, Laptop, Shoes, Book, Shoes]

        //SORU-*2)  "a" listinde Shoes elemanının tüm görünümülerini isiliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);


        //SORU-3 )
        /*Bir Salary listi oluşturunuz. Eğer Salary 10000 den az ise %20,
        10.000 ve 10000 den çok ise %10 zam yapınız*/

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);

        // SORU -4 ) 2 ArrayList in eşit olup olmadığını  kontrol eden kod yazınız.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('a');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol
        int counter = 0;

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler eğşit değil");
                break;
            }

            if (m.get(i) != n.get(i)) {

                counter++;

                System.out.println("Listler eğşit değil");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Lisler eşit");
        }

        //2.YOL

        boolean esitmi = m.equals(n);

        if (esitmi){
            System.out.println("Listler esit");
        }else {
            System.out.println("Lisler eşit değildir");
        }

    }
}
