package day22inheritancepolymorphism;

public class Cat extends Mammal {

    public int a = 14;

    public void eat() {

        System.out.println("Cats eat");
    }

    public Cat() {
        System.out.println("Cat");
    }
}
