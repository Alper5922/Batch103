package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {

    /*
    Aynıdata tipinde, çoklu data depolamakta kullanılan yapıya ARRAY denir
     */

    public static void main(String[] args) {

        //ARRAY OLUŞTURMA
        int stdAges[] = new int[7];

        //ARRAY YAZDIRMA
        System.out.println(Arrays.toString(stdAges));

        //ELEMAN EKLEME
        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges));

        //ARRAYDEKİ HER HANGİ BİR ELEMANI YAZDIRMA
        System.out.println(stdAges[4]);

        // SORU - 1) Array deki en küçüük ve en büyük elemanın toplamını
        // ekrana yazrınız

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        int son = stdAges[stdAges.length - 1];  // length()--> Parantezli olarak Stringlerde kullanılır. length __> olarak Arraylerde kullanılır
        System.out.println(ilk + son);

        // SOUR-2) stdAges Array i içindeki tüm elemanların toplanını
        //ekrana yazdıran kodu yazdırınız

        //1.YOL --For Loop--
        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.YOL --While Loop
        int top =0;
        int k=0;
        while (k<stdAges.length){

            top = top + stdAges[k];
            k++;
        }
        System.out.println(top);

        //3.YOL -- Do While
        int toplam =0;
        int m=0;
        do {
            toplam=toplam+stdAges[m];
            m++;
        }while (m<stdAges.length);
        System.out.println(toplam);

        //4.yol--FOR EACH LOOP
        //Array lerde kullanılır.
        int t =0;
        for (int w : stdAges){
            t = t +w;
        }
        System.out.println(t);

        //SORU-3)  String bir array oluşturunuz
        //Bu array a 5 tane isim yerleştirriniz
        //Bu isimlerdeki karakter sayılarının toplamını yazınız

        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";
        int karakter =0;
        for (String w:stdNames) {
            karakter = karakter + w.length();
        }
        System.out.println(karakter);

        //SORU-4)
        //Char bir array oluştur.5 eleman ekleyiniz
        //Sadece büyük harfleri ekrana yazdırınız.
        char ch[] = {'A','c','D','k','m','H'};

        for (char w : ch) {
            if (w>='A' && w<='Z'){
                System.out.print(" "+w);
            }
        }


    }
}
