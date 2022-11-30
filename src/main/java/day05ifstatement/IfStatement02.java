package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example1: Kullanıcı gün numarasını girsin program gün ismini versin


        Scanner input = new Scanner(System.in);
        System.out.println("gün numaasını giriniz");
        int g = input.nextInt();
        if (g == 1) {
            System.out.println("PAzar");
        } else if (g==2) {
            System.out.println("pazartesi");

        }else if (g==3) {
            System.out.println("salı");

        }else if (g==4) {
            System.out.println("çarşamba");

        }else if (g==5) {
            System.out.println("perşembe");

        }else if (g==6) {
            System.out.println("cuma");

        }else if (g==7) {
            System.out.println("cumartsi");

        } else{
            System.out.println("Böyle bir gün yoktur");
        }
    }
}
