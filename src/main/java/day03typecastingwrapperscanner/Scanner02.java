package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı gir");
        double sayı1 = input.nextDouble();
        System.out.println("ikinc sasyı giriniz");
        double sayı2 = input.nextDouble();
        System.out.println(sayı2+sayı1);
    }
}
