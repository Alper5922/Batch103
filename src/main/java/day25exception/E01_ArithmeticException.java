package day25exception;

public class E01_ArithmeticException {
    /*  1-Exception (istisnai hata) javada kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır.
        2- Exceptionlar ile çalışmanın iki yolu vardır
             a) try - catch kullanma ve exception oluşsa çalışmayı devam ettirme
             b) throw exception kullanarak çalışmayı durdurma (mesela  yazdığımız kod gereği bir dosya üzerineden  okuma
                 yapmamaız gerekiyorsa bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
        3- Eğer Exception 'ı handle etmez isek (halletmezsek) java çalışmayı durdurur.
        4- try - catch kullanırken try kodunu bir ya da birden fazla catch ile kullanabiliriz.
        5- try kodu  tek başına kullanılamaz. Catch ya da başka bir şey ile kullanılmalıdır.
        6- Eğer yazmış olduğunuz her hangi bir kod satırında problem olabileceğini düşünüyorsanız try -catch block içine koymalısınız
        7- Cath block parantezi içerisine olması muhtemel Exception Class ismi yazılır
        8- e.getmessage() methodunu kullanarak teknik mesajlar elde edebiliriz.
           System.out.println(); ==> burada yazmış olduğum mesajlar benim teknik olmayan mesajlarımdır.
           e.printStackTrace(); ==> metodu Exception ile ilgili detaylıca teknik mesaj verir.
           System.err.prntln() ==> burada yazmış olduğum mesajlar benim teknik olmayan mesajlarımı RENKLİ olarak yazar.
        9-Eğer try body içindeki kod çalışırsa catch blok devreye girmez.


     */

    public static void main(String[] args) {
//        divide(6,2);//3
//        divide(0,2);//0
//        divide(6,0);//Matematikte bir sayi 0 ile bölünemez

        // divide2(5,0);
        divide2(12,0);
    }
    //1. Yol Tavsiye edilmez.
    //Bir developer icin tüm matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide (int a, int b){
        if(b==0){
            System.out.println("Bir sayi sifir ile bolunemez");
        }else {
            System.out.println(a/b);
        }
    }
    //2. Yol try-catch kullanarak exception'ı handle etmek tavsiye edilir.
    public static void divide2(int a, int b){

        try{
            System.out.println(a/b);
            System.out.println("hi exception");
            System.out.println("bye exception");

        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu"+e.getMessage());
            e.printStackTrace();
            System.err.println("Bçlme işleminde bir problem oluştu");
        }
//java matematik ile ilgili karsılasılması muhtemel tum istisnalari, hatalari ArithmeticException class'ina koymustur.
//Matematikteki tüm istisnalari detaylari bilmek zorunda degiliz

    }
}
