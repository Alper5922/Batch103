package day05ifstatement;

import java.util.Scanner;

public class ifStatement03 {

     /*
        Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
            i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
            ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
    */

    public static void main(String[] args) {
        //Example: kullanıcıdan gün isimlerini alınız. O günü haftsonu mu haftaiçi miolduğunu kullanıcıya söyleyiniz
        Scanner input = new Scanner(System.in);

        //I.YOL

        System.out.println("Bir gün ismi giriniz");
        String gun = input.next();


        if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hafta sonu..");
        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("haftaiçi");
        } else if (gun.equalsIgnoreCase("salı")) {
            System.out.println("haftaiçi");
        } else if (gun.equalsIgnoreCase("çarşamba")) {
            System.out.println("haftaiçi");
        } else if (gun.equalsIgnoreCase("perşenbe")) {
            System.out.println("haftaiçi");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("haftaiçi");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("hafta sonu");
        } else {
            System.out.println("geçerli bir gün giriniz");
        }
//2.Yol:
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
//3.Yol:
        boolean haftaSonu=gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        if(haftaSonu){
            System.out.println("Hafta sonu...");
        }else if(haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
    }
}
