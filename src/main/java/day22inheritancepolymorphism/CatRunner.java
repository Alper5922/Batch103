package day22inheritancepolymorphism;

public class CatRunner {

    /*
    1)Java da Object oluştururken önce Parent Constructorlar  PArent'dan Child'a doğru çalıştırılır
    2) Java en üst Parent Constructur'a çıkabilmek için "super()" kodunu kullanır
    3) "super()" kodu her Constuctor'ın ilk satırında gizli olarak bulunur
    4) "super()" kodunu isterseniz görünür şekilde de yazabilirsiniz
    5) "super()" kodunu görünür şekilde yazarsanız sakın ha ilk satır dşında bir satıra koym ayınız hata verir
    6) "super()" kodu Parent Class dan contructor çağırmaya yarar
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        cat1.eat();

    }
}
