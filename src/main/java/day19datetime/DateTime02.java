package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //EX-1) Jaava dan aldığınız Date'i ay/gün/yıl olarak  yazınız
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2); //Eki/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);//Ekim/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);//10/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/d/yy"); // d--> 10'dan küçük aylaır 1,  2,  3 şekilind eyazar
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5); //10/21/22
        System.out.println();

        //EX-2) Javadan aldığınız time'ın formatını değiştiriniz
        LocalTime myTime = LocalTime.of(16,23,45,2345);
        System.out.println(myTime);//16:23:45.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm"); //"HH" --> 24 saat formatını kullanır
        String formattedMytime = dtf7.format(myTime);
        System.out.println(formattedMytime);//04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//16:23






    }
}
