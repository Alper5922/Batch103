package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //soru.1) Bir Stringde ki space hariç kaç tane karakter kullanıldığını gösteren kodu gösteriniz
        String str = "Ali okula gitti.";
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //REPLACE() metodu bir stringde ki  bir karakteri veya karakterleri değişitirmek için kullanılır.

        //sour-2) bir stringdeki tüm a harflerini büyük a ya çeviriniz
        String s = "Ankara'nın taşına gözlerimin yaşına bak";
        String yeni = s.replace("a", "*");
        System.out.println(yeni);

        //soru3: bir stringdeki tüm kara kelimelerinin yerine * koyunuz
        String t = "Kara kara düşünme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);

        //SOUR-4) Bir stringde ki tüm sayıları "*" a çeviriniz.

        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);

        /*
        Bi grup DATAyı ifade eden kodlara  "Regex" denir.
        "Regex" Regular Expressions

        1) Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler==> [a-z]
        3)tüm büyük harfler==> [A-Z]
        4)tüm harfler ==> [a-zA-Z]
        5)Sesli harfler ==> [aeiouAEIOU]
        6) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        7) Space ==> [ ]
        8) Tüm noktalama işaretleri ==> \\p{Punct}

        1)Rakamlar hariç tüm karakterler ==> [^0-9]
        2) Küçük harfler hariç tüm karakterler ==> [^a-z]
        3)büyük harfler hariç tüm karakterler==> [^A-Z]
        4)tüm harfler hariç tüm karakterler ==> [^a-zA-Z]

        7) Space hariç tüm karakterl ==> [^  ]



         */
//Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz


        String u = "Ali 13 yaşında, dersem inanma!....";
        int a = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(a);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";
        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length() > 7;
        //  ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;
        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //v)En az 1 kucuk harf icermeli
        boolean fifith = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean pwdGecerli = first && second && third && fourth && fifith;
        if (pwdGecerli) {
            System.out.println("PAssword geçerli");
        } else {
            System.out.println("geçersiz");
        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println("noktalama isaretlerinin sayisi:"+number);

        //Soru - 8 ) Verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa
        // ekrana "harika" yazdırın aksi halde "Normal" yazdırın.
        String v ="kAlex";
        boolean baslangıc = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangıc && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }

}

