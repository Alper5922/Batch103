package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
/*
        // SORU-1) Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        System.out.println("Lütfen isim giriniz");
        String isim = input.next();
        // 1.YOL)
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);
        //Yazdığımız kod sadece bazı durumlar için çalışırsa o code'a "HARD CODING" denir.
        //Her durum için çalışırsa 0 code'a "DYNAMIC CODE" denir
        System.out.println("" + ilkHarf + sonHarf);
        //2YOL)
        String ilk = isim.substring(0, 1);
        String son = isim.substring(isim.length() - 1);
        System.out.println(ilk + son);

        //soru 2) Verilen stringdeki sadece hayvan isimlerini yazdırınız
        // "Ben kedi eşim tavuk oğlum inek sever"
        String str = "Ben kedi eşim tavuk oğlum sever inek inek";
        String a = str.substring(4, 8);
        String b = str.substring(15, 20);
        String c = str.substring(34, 38);
        System.out.println(a + b + c);
*/
        //SORU-3) İlk isim ve soy ismi içeren isimlerden ilk ve soy isimlerden başharflerini ekrana yazdırınız
        System.out.println("ilk ve soy ismi giriniz");
        String tamIsim = input.nextLine();
        String d = tamIsim.substring(0, 1);
       String e = tamIsim.split(" ")[1].substring(0, 1);
        System.out.println(d+e);

    }
}
