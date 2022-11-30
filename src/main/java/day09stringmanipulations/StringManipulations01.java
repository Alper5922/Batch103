package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";
        //IndexOf() metodu verilen karakter ya da karakterlerin ilk görüldüğü yerin indexini verir
        int a1 = str.indexOf("a");
        System.out.println(a1);

        //lastIndexOf() == istenilen karakter ya da karakterlerin en son konumunun indexini verir
        int a2 = str.lastIndexOf("a");
        System.out.println(a2);
        // kelimenin indexi yazılmışsa==> ilk görülen kelinein ilk harfinin indeksini veirir
        String str2 = "Kara kara düşünme Ankara";
        int a3 = str2.indexOf("kara");
        System.out.println(a3);
        // İndexof un için de " " string ya da ' ' char  da kullanılabilir
        //Char yapıldığında parantez için de tek karakter kullnılır
        String s = "Mississippi";
        int inxI = s.indexOf('s');
        System.out.println(inxI);

        s.indexOf("iss"); // İlk görünümün i,lk karakterinin indexini verir
        int a5 = s.lastIndexOf("iss"); //son görünümün "ilk" karakterinin indeksini verir.
        System.out.println(a5);

        //Example 1: Bir String'deki bir character'in tekrarli
        // veya tekrarszi olup olmadigini gosteren kodu yaziniz

        String t = "Helloooo";
        char c = 'o';
        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsız");
        } else {
            System.out.println("Tekrarlı");
        }
        // belirli bir karakterden sonraki istenilen karakterin isndexini verrir.
        //Bu soruda ilk 6 karakterden sonra ki ilk a'nın indeksini verir
        //İndex i sayarken en baştan sayıyoruz ancak ilk 6 daki harfleri dikkate almıyoruz
        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a", 6);
        System.out.println(sonuc);  // sonuç:7

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabule edip en bastan
// bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);//8

        // isEmpty() ==> String in içinin boşmu olup olmadığını verir. Space için de dolu görür
        // Bu metodu kullanmadan "length()==0" ise empty olur
        String v = " ";
        Boolean bosmu = v.isEmpty();
        System.out.println("isEmpty : "+bosmu);
        // isBlank() hem boş hem de sadece space içeren space'ler için TRUe verir
        String x = " ";
        Boolean blankmi = x.isBlank();
        System.out.println(blankmi);

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();
        if (ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim...");
        } else {
            System.out.println(ilk);
        }


    }
}
