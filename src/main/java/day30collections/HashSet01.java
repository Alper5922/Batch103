package day30collections;

import java.util.HashSet;

public class HashSet01 {

      /*
        # Hash bir tekniktir. Birbirine benzemeyen kodlar üretir.Bu kodlar data'yı uniq yapar
          Set lere çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız
        # HashSet eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcmaz. Bu yüzden çok hızlı çalışır
        #HashSetler indeks kullanmazlar.

       HashSetler:
        1)tekrarsiz elemanlarda
        2)sırlama onemli degilse
        3)hız cok önemliyse kullanılır


      */
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add("Mango"); // Varolan elemanı kelerseniz hata vermez, son ekleneni var olan datanın üzerine yazar. (Overwrite)
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

        emails.add(null); // null'ın tekrarlı eklemesi
        System.out.println(emails);

        System.out.println(emails.size()); // 6
        emails.clone();

    }
}
