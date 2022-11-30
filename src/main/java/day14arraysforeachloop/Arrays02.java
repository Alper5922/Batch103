package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]
        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];

        int idx = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        // EX 2 ) Bir Arrayin içinde her hangibir elemanın olup olmadığını
        // ve kaç kere tekrarlandığını kontrol eden ve gösteren kodu yazınız
        // [2, 1 ,2, -3, 2]==> Kullanıcı 2 yi sordu__2 elemanı var ve 3 kere tekrarlandı

        int arr[] = {2, 1, 2, -3, 2};

        int eleman = 9;
        int counter =0; //FLAG: Bazı durumların oılup olmadığını kontrok etmek için "Flag" kullanılır.

        for (int w :arr){
            if (w==eleman){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(eleman+" array'de " +counter+" defa var");
        }else {
            System.out.println("Eleman Arrayda yok");
        }
    /*
    EX-3) Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
         "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana
     */

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana";
       sentence= sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

       String words[]= sentence.split(" ");
       Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);


    }
}
