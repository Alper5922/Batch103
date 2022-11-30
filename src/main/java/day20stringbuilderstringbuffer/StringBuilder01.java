package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        1) StringBuilder bir class'tır.
        2) StringBuilder, String oluşturmaya yarar.
        3) "String" Class varken niçn StringBuilder'a ihtiyaç duyarız?
            Çünkü "String" Class immutable (değişime kapalı) class'tır ancak biz vbazen "mutable" String Class lara ihtiyaç dyarız
            StringBuilder bize Mutable String verir.
        4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
           i)Memory'de yeni bir variable yeni değerle oluşturulur
           ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
           iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.
          5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.
         */


        String str = "Java";
        str = "Java";
        System.out.println(str);

        //StringBuilder nasıl oluşturulur?
          //1.YOL:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.YOL:
        StringBuilder strb2 = new StringBuilder();
            //yol a:
        strb2.append("Java ");
        strb2.append("is easy");
        strb2.append("!!!");
        System.out.println(strb2);
            // yol b:
        strb2.append("Learn ").append("Java earn").append(" money");
        System.out.println(strb2);


        //  StringBuilder'da karakter sayısı nasıl bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Catmmmmmmmmmmmmmmm");


        // length()
        int numOfCharacter = strb3.length();
        System.out.println(numOfCharacter);

        // capacity() ----> aşımlarda var olanın iki katının 2 fazlasını verir
        int capacity = strb3.capacity();
        System.out.println(capacity);

        // setCharAt()
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete()
        strb3.delete(3,18);   //3 ü siler, 18inci indeksi silmez
        System.out.println(strb3);

        //deleteCharAt()--->indeks 2 deki karakteri siler
        strb3.deleteCharAt(2);

        //reverse()----> StringBuilder i ters çevirir
        strb3.reverse();
        System.out.println(strb3);

        //toString();---> StringBuilder'ı--String'e çevirmek için kullanılır.
       String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3);

        //Strin den --> Stringbuilder'a
        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println("strb4 :  "+strb4);

        //insert()
        strb4.insert(1,"xxx"); // 1.karakterden sonra "xxx" koyar
        System.out.println(strb4);

        //insert(3, "KLMOPQRSTU", 5, 8); ==> 3. charater'den sonra, "KLMOPQRSTU" String'inin index 5, 6, 7 deki character'lerini yerlestirir
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        //compareto()
        //            StringBuilder lar tamamen aynı ise 0 verir
        //            a alfabetik sırada b den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir
        //            iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        StringBuilder a =new StringBuilder("Java");
        StringBuilder b =new StringBuilder("Java");

        int sonuc = a.compareTo(b);
        System.out.println(sonuc);





    }
}
