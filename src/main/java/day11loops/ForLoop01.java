package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        // EXAMPLE-1)  3 DEN 6 ya kadar olan sayıların toplamını bulan  kodu
        //yazınız
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        // EXAMPLE-2) 6 dan 3 e kadar tamsayıların çarpımını bulan  kodu
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
        }
        System.out.println(multiply);

        //example -3) size verilen bir tam sayının rakamları toplamını bulunuz
        int num = 385;
        int sonuc = 0;
        for (int i = num; i > 0; i = i / 10) {
            sonuc = sonuc + i % 10;
        }
        System.out.println(sonuc);

        //EXAMPLE - 4)
        //Size verilen bir stringi ekrana ters çeviren kodu yazınız
        //  "Kaba" ==> "abaK"
        String str = "Kaba";
        String ters = "";
        for (int i = str.length() - 1; i > -1; i--) {
            char c = str.charAt(i);
            //ters = ters + c;
            System.out.print(c);
        }
        //System.out.println(ters);
    }
}
