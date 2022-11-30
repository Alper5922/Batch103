package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Datetime03 {
    public static void main(String[] args) {

        //EX-1) Japonya ve Almanya arasındaki zaman farkkını saat hesaplayan kodu yazınız
        LocalDateTime japon = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark = ChronoUnit.HOURS.between(japon,germany);
        System.out.println(fark);

        //EX-2) Sabit bir tarih oluşturunuz.
        LocalDate myDate = LocalDate.of(2011, Month.OCTOBER,21);
        System.out.println(myDate);

        /*
        1) Java'da sabit dataları (gün, ay, eyalet isimleri vb.) depolamak ve grektiğinde kullanmak için depolar
           oluştururuz. Bu depolara ENUM denir. Bunların içine dğişecek datalar konulmaz.
         */

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan",
        // "GERMANY" icin "Araba", "RWANDA" icin "Cay"
        Countries country = Countries.USA;

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big!");
                break;
            case CANADA:
                System.out.println("Cold!");
                break;
            case TURKEY:
                System.out.println("Vatan!");
                break;
            case GERMANY:
                System.out.println("Araba!");
                break;
            case RWANDA:
                System.out.println("çay!");
                break;
            default:
                System.out.println("Unknown");
        }

    }
}
