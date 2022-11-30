package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Bir STringdeki sesli harflerin sayısını bulan kodu yazınız
        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        String harfler[] = str.split("");
        str= str.toLowerCase();
        int counter = 0;
        System.out.println(Arrays.toString(harfler));

        for (String w : harfler) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    //break;
            }

        }
        System.out.println(counter);
    }
}
