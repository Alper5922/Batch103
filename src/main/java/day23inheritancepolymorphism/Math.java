package day23inheritancepolymorphism;

public class Math extends Courses {

    public  void practice(){
        System.out.println("Solve questions");
    }
    public Math(){
        super("x");
        System.out.println("Constructor1");
    }
    public Math(int a){
        this(); // Aynı Class 'ın içinde diğer Contructor'ı kullan
        System.out.println("Constructor2");
    }

}
