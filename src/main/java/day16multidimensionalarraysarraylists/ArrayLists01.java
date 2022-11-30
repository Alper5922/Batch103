package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
/*
      ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
      Array ile ArrayList'in farki nedir?

         1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
           Array'ler eleman sayisinda "fixed" dirler.
           ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.

         2)Array'lerin icine "primitive" ve "reference" lar konabilir.
           ArrayList'lerin icine ise sadece "non-primitive" ler konulur.

         3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.

          Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
               eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
 */
        // Array list nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        ArrayList<Integer> heights = new ArrayList<>();

        List<Integer>nums = new ArrayList<>();

        // Array list nasıl yazdırılır
        System.out.println(nums);

        // Nasıl eleman eklenir
        // ## add() metodu elemanı her zaman en sona ekler. (insertion order)
        nums.add(21);//----------->> Booplean return eder
        nums.add(18);
        System.out.println(nums);

        nums.add(1,99);//------->>Hiçbir şey return etmez
        System.out.println(nums);


        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices); //------>> Bir liste diğer listi ekler. list elemanları aynı data tipinde olmalı
        System.out.println(nums);

        nums.addAll(2,prices);
        System.out.println(nums);

        //Arraylistlerin eleman sayıları nasıl bulunur?? -----> size();
        int elemanSyisi = nums.size();
        System.out.println(elemanSyisi);

        //Array listte her hangibir elemanı seçmek------>> get();
        //İstenen bir indeksteki elemanı verir
        int el1 = nums.get(3);
        System.out.println(el1);

        // ArrayList in boş olup oladığını
        boolean bos1 = nums.isEmpty();
        boolean bos2 = ages.isEmpty();

        // ArrayListde eleman değiştirme------<<>>> set();
        nums.set(3,200);  //  3-> kaçıncı indeksi değiştirmek istiyoruz
                          //  200--> 3.indeksin yerine kaç koymak istiyoruz
        System.out.println(nums);

        // SORU-1) Nums ArrayListedki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız

        for (int w : nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);

        //remove()---->> Listten silmek için. metodun içine tam sayı koyarsanız JAVA bunu İndeks olarak kabul eder
        //Array listten 200 elemanını siliniz
        /*200 doğrudan silmez. Çünkü Java bunu Primitive kabul eder.
         Wrapper Class ile Non-Prinitive çevrilir.*/






        //     * * *  Ö N E M L İ * * *

        //Note 1: Tum tamsayilar aksi söylenmedikce Java icin "primitive" dir. Yani "int" dir.
        //Note 2: "primitive" ler ArrayListlerin elemani olamazlar.
        //Note 3: "primitive" i Wrapper Class'a cevirirseniz non-primitive olur
        //         ve non-primitivler ArrayListlerin elemani olur,index olamaz.

        //Ex 2: ArrayList'den 34 elemaninin ilk gorunumunu  siliniz

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);



    }
}
