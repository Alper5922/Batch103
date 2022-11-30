package day16multidimensionalarraysarraylists;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);
       /* ## Array veya Collection varsa "for each loop" kullanmak ilk tercihiniz olsun.
        Array veya Collection var ama "index" kullanmak zorundasanız o zaman "for-each-loop" çalışmaz,
        for-loop / while-loop ya dado while loop kullanmalısınz
        * */

        // bir Multisimensional arrayi normal arraya çeviren kodu yazınız
        //{{2,5,1}{32,75}}===> {2,5,1,32,75}
        // *)Multidimensional arraydakei eleman sayısı önceliikle bulunmalı.Çünkü yeni arraain uzunluğu orijinal aarayin eleman sayısına eşit olmalu
        // *)
        int brr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int toplam = 0;
        for (int[] w : brr) {
            toplam = toplam + w.length;
        }
        System.out.println(toplam);

        int idx = 0;

        int crr[] = new int[toplam];

        for (int[] w : brr) {
            for (int k : w) {
                crr[idx] = k;
                idx++;
            }

        }

    }
}
