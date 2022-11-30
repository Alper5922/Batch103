package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*
    "final" keyword nedir?

    1-"final" keyword i) variable'larda kullanılabilir. Sadece declare etmek yetmez, değer ataması yapılmasılı
                       public final int age = 12;--> artık değer değiştirilemez

                      ii) Method larda kullanılabilir
                          public final int add(){
                                    return a+b;      }
                           a) Bir metod oluşturulurken "final" olarak oluşturulmuş ise
                                o method'un body'si asla degistirilemez. Dolayisiyla o method override edilemez.
                      iii) Class'larda kullanılabilir
                           Bir Class "final" ise o Class kısırlaştırılmıştır.
                           Bir Class "final" ise o Class'a extends edilemez
                           "final" Class child olabilir.


     */
}
