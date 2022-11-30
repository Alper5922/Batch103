package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        String a ="Java Kolaydir";
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

    //REPLACEFIRST()


     //CONCATENATION
        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
//"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
//Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?


        // TRIM()
        String e = "    Tom Hanks     ";
        System.out.println(e);// "    Tom Hanks     "

       //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.

        String h = "Java";
        String i = "Java";
        int k = h.compareTo(i);
        System.out.println(k);


        //REPEAT
        //a.repeat(5); kodu "a" String'ini yanyana 5 kere yapistirir
        //Windows==>ctrl e basılı tutun
        String n= a.repeat(3);
        System.out.println(n);
    }
}
