package day18arraylistspassbyvalue;

public class PassByValue01 {
/*

1)Java, variable'ların orijinal değerlerini korumak ister.
2)Variable metotlar içinde kullanıldığında, Java metodun içine
orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.

NOTE: Java "PAss By Value" kullanır. Bazı porogramlama dilleri orijinal
değeri koruma altına almamıştır. Bu işi DEVELOPERlara bırakmıştır. Bu tarz
diller "PAss By Reference" kullanır.


 */

    public static void main(String[] args) {

        int x =5;
        System.out.println(x);
        change(x);
        System.out.println(x);

        int ucret = 100;

       int kopya = indirim(ucret);
        System.out.println(kopya);

        System.out.println(ucret);
    }
    public static void change(int a){
       int x= a*3;
       System.out.println(x);
    }

    public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;
    }
}
