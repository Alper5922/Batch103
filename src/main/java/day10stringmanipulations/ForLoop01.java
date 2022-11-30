package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //EXAMPLE 1) Ekrana 5 kere "hi" yazdırınız.
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        //Tekrarlı   işller için loop kullanıırız
        //4 çeşit LOOP vardır.
        /*
            1-for-loop
            2-while loop
            3-do-while-loop
            4-for-each-loop
         */
        // 2-EXAMPLE) Ekrana 5 kere "hi" yazdırınız.

        //3-EXAMPLE
        // 4 den 17 ye kadar tüm tamsayıları ekrana yazdıran kodu yazınız
        for (int i = 4; i < 8; i += 1) {
            System.out.print(i + " ");
            System.out.println();
        }
        //example 4
        for (int i = 14; i > 5; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //EXAMPLE 5:
        //14 DEN 5 E KADAR TÜM ÇİFT SAYILARI
        //1.WAY
        for (int i = 14; i > 4; i -= 2) {
            System.out.print(i + " ");
        }
        //2.WAY
        for (int i = 14; i > 4; i -= 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


//EXAMPLE 6- 28 den 157 kadar tüm tek sayıları ekrana yazdırınız
        for (int i = 28; i < 158; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
//EXAMPLE 7)  "Java" Stringini "J*a*v*a*" Stringine çeviren kodu yazınız
        String str = "Java";
        for (int i = 0; i < str.length();i++ ){
            System.out.print(str.charAt(i)+"*");
        }
        System.out.println();

        //EXAMPLE-8) Size verilen Stringde tekrarsız karakterleri ekrana yazdırınız

        String s ="Hellooo Ali";
        for (int i=0; i< s.length(); i++){
            char c=s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c )){
                System.out.print(c);
            }
        }

    }
}
