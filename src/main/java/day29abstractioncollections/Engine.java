package day29abstractioncollections;

public interface Engine extends Vehicle {

    //Class--> Interface ==> implements kullanılır
    //Class--> Class   ==> extends
    //Interface--> Interface   ==> extends
    //Interface--> Class   ==> impossible
    //ÖZET ==> tipler aynı olduğunda extends, diğer durumda implements


    // Interface'lerdeki tüm variable'lar otomatik olarak "public"dir
    // Interface'lerdeki tüm variable'lar otomatik olarak "final"dir ve değer atanmış olmalı
    // Interface'lerdeki tüm variable'lar otomatik olarak "static"dir

    int price = 2000;

    void run();


}
