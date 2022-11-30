package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Verilen yılın  "Leap Year" olup olmadğını kotrol eden kodu yazınız
          i) Yıl 100'e bölünürse 400'e de bölünmelidr.
          ii) Yıl 100'e bölünmezse 4'e bölünmelidr.
         */
        int year = 2001;
        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);

        /*
Asagidaki kurallara gore password'un dogru olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir.
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
         */
        String pwd = "i2a3ed54";
       String Geçerli =  pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Geçerli" : "Geçersiz") : (pwd.charAt(0)=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(Geçerli);

        String name = "mert";
        System.out.println(name.contains("i"));
    }
}
