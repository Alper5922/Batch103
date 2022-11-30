package day07ternarystringmanipulation;

import org.w3c.dom.ls.LSOutput;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*String Class Methodlari

        1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
        ii)equals() method'u "boolean" return eder.

        2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
        ii) equalsIgnoreCase() method'u "boolean" return eder.

        3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
        ii) toLowerCase() method'u "String" return eder

        4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
        ii) toUpperCase() method'u "String" return eder

        5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                ii) charAt() method'u "char" return eder.

        6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
        ii) length() method'u "int" return eder.

        7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
        ii) contains() method'u "boolean" return eder.

        8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
        ii)split() method'u "Array" return eder.

         */

        /*Bir password'ün geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız
          1-En az 8 karakter içermeli
          2-Space karakteri içermemeli
          3-İlk harf büyük harf olmalı,
          4-Son karakteri ? olmalı
         */
        String pwd = "Manis a12?";
        //En az 8 karakter içermeli
        boolean first = pwd.length() > 7;
        System.out.println(first);

        //Space karakteri içermemeli
        boolean second = pwd.contains(" ");
        System.out.println(second);

        //İlk harf büyük harf olmalı,
        boolean third = (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z');
        System.out.println("İlk harf Büyük mü: " + third);

        //4-Son karakteri ? olmalı
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';
        System.out.println("Sonkarakter ? mi : " + fourth);

        System.out.println(first && second && third && fourth);


    }
}
