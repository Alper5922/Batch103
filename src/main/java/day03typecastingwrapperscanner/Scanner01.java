package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey kullanıcı yasini gir");

        byte age = input.nextByte();
        System.out.println("Hey kullnaını senin yaşı " + age +"dır" );
    }
}
