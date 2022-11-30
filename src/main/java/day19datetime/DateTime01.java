package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //ex-1) Anlık tarihi ekrana yazdıran kodu yazınız
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //EXAMPLE-2) Anlık zamanı yazdırınız
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //EX-3)Anlık tarihi ve Anlık zamanı
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //EX-4) Japonyada ki anlık  tarih ve saati ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTineInJapon = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTineInJapon);

        LocalDateTime currentDateTineInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTineInIstanbul);

        //EXAMPLE-6)  Bugünden 789 gün sonr aemekli olacağınıza göre emeklililk tarihinihesaplayan kodu yazınız
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retiredDay = countDate.plusDays(789);
        System.out.println(retiredDay);

        ////Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);
        long fark = ChronoUnit.DAYS.between(dobAli,dobVeli); // Daha eski tarih daha önce yazılmalıdır.
        System.out.println(fark);

        //EXAMPLE 8) Tom Ali'den 3 yıl 8 ay 13 gün sonra doğdu. ali ise Veliden 1 yıl 15 gün öcne doğdu.
        // Tom doğum tarihi 18.11.2011 ise Veli ve alinin doğum tarihlerini bulunuz
        LocalDate dobTom = LocalDate.of(2011,11,18);
        LocalDate dobAli1 = dobTom.plusYears(-3).plusMonths(-8).plusDays(-13);
        LocalDate dobVeli1 = dobAli1.plusYears(1).plusDays(15);
        System.out.println("Ali'nin doğum tarihi : "+dobAli1);
        System.out.println("Veli nin doğum tarihi : "+dobVeli1);

        //EXAMPLE 9) İstanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay  vardır
        LocalDate isFeth = LocalDate.of(1453,5,29);
        LocalDate cumKur = LocalDate.of(1923,10,29);
        Long fark1 = ChronoUnit.MONTHS.between(isFeth,cumKur);
        System.out.println(fark1);

        //EX 10 ) Verilen tarihin hangi burçta olduğunu gösteren kod
        LocalDate myDate = LocalDate.of(1989,12,7);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day>21 && month==3) {
            if (day<20 && month==4){
                System.out.println("Boğa burcu");
            }
        }


        }
}
