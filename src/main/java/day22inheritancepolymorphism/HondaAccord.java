package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
    1) Siz Class oluşturduğunuzda Java otonatik olarak size görünmez bir Contructor verir, çünkü Java , Class ın
    bir kalıp olduğunu  ve Object oluşturmak için yaratılıdığını ve Object oluşturmak için Constructur ın şart
    olduğunu bilir
    2) Java'nın otomatik olarak ouşturduğu bu görünmez constructor'a default constructor denir
    3) Siz kendiniz her hangi bir constructur oluşturduğunuz da Java "Default constructor" ı siler
    4) bir Clas'da birden fazla constructor olabilir
    5) "this" keyword "Bu Class" anlamındadır.  "this price " demek bu Classdaki "price" isimli variable demektir
    "this.price" syntax 'i constructorların içinde kullanılır
    6) Constructor  kullanarak variable'lar üzerinde yaptığınız değişimler sadece Object üzerindeki variable'ların
    değerlkerini değiştirir
     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;
    }

    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }
}
