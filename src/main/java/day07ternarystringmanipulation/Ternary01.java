package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {

        //Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız
        //1.YOL
        int a = 12;
        if (a > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif değil");
        }
        //2.YOl

                    //condition      ?     Doğru ise uygulanacak   Yanlış ise uygulanacak
        String sonuc = a > 0         ?       "Pozitif"         :      "Pozitif dedği";
        System.out.println(sonuc);

          // 2 sayıdan küçük olanı seçen kodu yazınız.
        int b = 120;
        int c = 23;
        int min = b<c ? b : c;
        System.out.println(min);

        //3) Verilen bir sayınınmutlak değerini hesaplayan kodu yazınız
        //Negatif sayıların mutlak drğeri -1 ile çaarpımlarıdır.
        int d= -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

    //4) İki sayı aynı işaretli ise bu sayıları çarpınız, farklı işaretli ise "işlem yapamam" mesajı veriniz
        int e = 12;
        int f = 10;
       Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "işlem yapamam";
        System.out.println(islem);
    }
}
