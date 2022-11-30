package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Example - ) kULLanıcıdan bir sayı alınız ve sayı 100'den
        // küçük ise ekrana kazandın yazdırınız.Aksi  halde
        //ekrana kaybettin yazdırın. Kullanıcı kazandıkça oyun devam etmeli
        Scanner input = new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Bir sayı giriniz");
            sayi = input.nextInt();
            if (sayi < 100) {
                System.out.println("Kazandınız");
            }

        } while (sayi < 100);
        System.out.println("Kaybettiniz");


      /*
      EXAMPLE-2)
      Kullanıcıdan isimler alınız.
      ilk harfinin büyük harf olup olmadığını kontrol ediniz
       */
        do {
            System.out.println("Isminizi giriniz");
            char ilkHarf = input.next().charAt(0);
            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("İsmi başarıyla girdiniz");
            } else {
                System.out.println("İsmi yanlış girdiğiniz için işleminiz iptal edilmişltir.");
                break;
            }
        } while (true);

        //INFINITE LOOP
        //Infinite Loop : Sonsuz Döngü

        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsalı" olusur.

        /*for(int i=1; i<4; i--){
           System.out.println("Hi!");
       }*/


        //Artirma azaltma kismini yazmassaniz "infinite loop sorunsali olusur"
        /*for (int i = 1; i < 4; ) {
            System.out.println("Hi!");
        }

        int i = 12;

        while (i < 15) {
            System.out.println("Hi!");
        }*/

    }
}
