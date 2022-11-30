package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args) {

        /*
        METOD OVERLOADING NASIL YAPILIR?
        1) Mettot işlemleri aynı olmalıdır
        2) Metot parametleri farklı olmalıdır
            i) Parametre sayıları değiştirilebilir
            ii) Parametrelerin data diplerini değiştirebilirsiniz
            iii) Parametrelerin yerlerini değiştirebilirsiniz, ancak data tipleri farklı ise
        3) Metod ismi + parametreler = Method Signature
        Method Signature dışında ne değiştirirseni değiştirin Java o metodları faklı kabul etmez
         */




        add(3 ,5);

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
}
