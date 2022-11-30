package day20stringbuilderstringbuffer;

import java.time.LocalDate;

public class DateTime01 {
    public static void main(String[] args) {
        //EXAMPLE - 1)
        /*
        Tom Ali'den 3 yıl 8 ay 13 gün sonra doğdu. ali ise Veliden 1 yıl 15 gün öcne doğdu.
        // Tom doğum tarihi 18.11.2011 ise Veli ve alinin doğum tarihlerini bulunuz
         */
        LocalDate dobTom = LocalDate.of(2011,11,18);
        LocalDate dobAli1 = dobTom.plusYears(-3).plusMonths(-8).plusDays(-13);
        LocalDate dobVeli1 = dobAli1.plusYears(1).plusDays(15);
        System.out.println("Ali'nin doğum tarihi : "+dobAli1);
        System.out.println("Veli nin doğum tarihi : "+dobVeli1);
    }
}