package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
//Kullanıcıdan ilk, orta ve soy ismini, kimlik numarasını alınız ve aşağıdaki formatta ekrana yazdırınız.

       Scanner input = new Scanner(System.in);

       //1.YOL
//        System.out.println("İlk isminizi giriniz");
//        String ilkİsim = input.next();  // next() metodu lullanıcıdan String datası almak için kullanılır.
//        System.out.println("Orta isminiz giriniz..");
//        String ortaİsim = input.next();
//        System.out.println("Soy isminiz giriniz..");
//        String soyİsim = input.next();
//        System.out.println("kimlik numaranızı giriniz");
//        String kimlikNo = input.next();
//        System.out.println(ilkİsim+" "+ ortaİsim +" "+ soyİsim);
//        System.out.println(kimlikNo);

        //2.yol
//        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//
//        System.out.println(ilk + " " + orta + " " + soy);
//        System.out.println(kimlik);

        /*
            next() ile nextLine() in farki nedir?
            next() methodu kulanicidan gelen String'in sadece ilk kelimeisni alir.
            nextLine() methodu kulanicidan gelen String'in tamamini alir.
        */

        //3.yol
        System.out.println("ilk orta ve soy ismiizi giriniz");
String tamİsim = input.nextLine();
        System.out.println(tamİsim);
        System.out.println("Kimlik numarasını giriniz");
        String kimlikNumarası = input.next();


    }


}
