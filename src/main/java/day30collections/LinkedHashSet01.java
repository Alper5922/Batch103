package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    /*
    LinkedHashSet'ler elemanları ekleme sırasına ( Insertion Order ) göre yerleştirrler

    LinkedHashSet elemanları sıralamada zaman harcadığı için LinkedHashSet'lere göre yavaş çalışır.
     */
    public static void main(String[] args) {

        LinkedHashSet<String> emails = new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");

        System.out.println(emails);

        emails.add(null);
        System.out.println(emails);

    }
}
