package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {
        //MultiDimensionalArray kısa yoldan nasıl oluşturulur?
        char arr[][] = {{'a','b'},{'C','D','E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));

        //Bir String MultiDimensional Array de içinde a olan
        //elemanları konsola yazdırınız
        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        for (String[] w : brr ){

            for (String k: w){
                if (k.contains("a")){
                    System.out.print(k+" ");
                }
            }
        }
    }
}
