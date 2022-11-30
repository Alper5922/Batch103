package day05ifstatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        //Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = input.nextInt();
        if (s % 2 == 0) {
            System.out.println("Çift Sayı");
        }
        if (s % 2 != 0) {
            System.out.println("Tek sayıdır..");
        }

        //2.yol
        if (s % 2 == 0) {
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek sayıdır");
        }
        //example-2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız
        System.out.println("bir sayı giriniz");
        double d = input.nextDouble();
        if(d>0) {
            System.out.println("Poziitif");
        } else if (d==0) {
            System.out.println("sayı nötr");
            } else {
            System.out.println("Negatif");
        }
    }
}
