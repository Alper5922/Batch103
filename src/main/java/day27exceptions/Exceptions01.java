package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3);

    }

    //Verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz
    public static double compareNumOfCharacters(String s, String t){
        double result = 0;
        try {
            result = s.length() / t.length();
        }catch(NullPointerException e){
            System.out.println("length() method'u null ile kullanilamaz");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }

        return result;
    }
    //INTERVİEW QUESTİON
    /*
    ""final" ,  "finally", "finalize" açılayınız.
    1) "final" bir keyword'dür Variable, Class ve methodlar için kullanılır
    2) "finally" bir "code block" dur
        "try-catch" veya sadece try ile kullanılır
        "finally" code block içine yazılan codelar
        Mesela DAtabase ile connection ı kesmek her halukarda yapılması gereken bir fiildir.. Bunu finally ile yapabiliriz
    3)  "finalize" ==> Bir mettoddur Bu metod java tarafından data'lar imha edilmeden önce çağrılır. Bu metot dataları imha edilecek hale
        getirir. Daha sonra Garbage Collector dataları imha eder.

        finalize metodunun develeoperlar da çağırabilir ama Java kendi bildiğini yapar.

     */

}
