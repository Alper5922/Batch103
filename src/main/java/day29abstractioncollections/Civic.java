package day29abstractioncollections;

       /*
             "abstract methodlar" sadece ne yapılacağını söyler(what to do),
             "concrete methodlar" ne yapılağı ile birlikte nasıl yapılacağını da söyler(how to do)

             "interface" ler yapılacak işler listesidir.(To do list)

             "multiple parent interface" kullandığınızda aynı method ismi le birden fazla method oluşturursanız
             bu methodların return typları aynı olmalıdır. Aksi takdirde hata verir

             "interface" lerde contructor oolmadığı için "interface" lerden object oluşturulamaz
             "abstract class"larda class oldukları için contructor vardır ama contructorla abstract classlarda
             object oluşturmazlar.

       INTERVİEW QUESTION
             abstract class ile Interface arasındaki fark?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

       */


public class Civic implements Engine, Ac {
    @Override
    public void run() {

    }


}
