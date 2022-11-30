package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //kullanıcıdan en boy alıp alan ve çevre hesaplayan kod?
        Scanner input = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz");
        double en = input.nextDouble();
        System.out.println("Uzun knarı giriniz");
        int boy = input.nextInt();
        double alan =en*boy;
        double cevre = 2*(en+boy);
        System.out.println("Dikdörtgenin alanı " + alan + " Didörtgenin cevresi " +cevre );
    }
}
