package day11loops.day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: 3 den 10 a kadar
        // tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
        //1.WAY
        for (int i = 3; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        //2.WAY

        int i = 3;
        while (i < 11) {

            System.out.print(" " + i);
            i++;
        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tum cift
        // sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int s = 17;
        while (s >= 4) {
            if (s % 2 == 0) {
                System.out.print(" " + s);
            }
            s--;
        }
        System.out.println();
        //Example 3: 12 den 67 ye kadar
        // sayıların toplamını veren kodu yazınız

        int sum = 0;
        int m = 12;
        while (m < 68) {

            sum = sum + m;
            m++;
        }
        System.out.println(sum);
        System.out.println();
//Example 4: Size verilen bir tamsayini rakamlari
// toplamini ekrana yazdiran kodu yaziniz

        int t = 385;
        int sum1 = 0;
        while (t > 0) {

            sum1 = sum1 + t % 10;

            t = t / 10;

        }
        System.out.println(sum1);
        System.out.println();

        //EXAMPLE 5) Kullanıcıdan aldığınız rakamın çarpım
        // tablosunu yazdırınız
        Scanner input = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int r = input.nextInt();
        int c = 1;
        while (c <= 10) {

            System.out.println("  " + r + "x" + c + "=" + r * c);

            c++;
        }


    }
}
