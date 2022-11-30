package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // binarysearch() method==> bir elemanın arrayda olup olmadığını
        // bu metodu kullanmadan önce mutlaka Arrays.sort() kullanılmalıdır.
        // binarySearch () metodu arrayda varsa indexini return eder
        /*Aradığınız eleman Array de yokda negatif bir sayı alınır . - işareti
         array de olmadığı, sayı ise olsaydı kaçıncı sırada olduğunu verir*/


        int arr[]={12, 31, 43, 43, 14};
        int sayi = 30;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int indx1 = Arrays.binarySearch(arr, sayi);
        System.out.println(indx1);
    }
}
