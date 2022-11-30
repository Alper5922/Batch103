package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;

        short sort = 23;
        double newsort = sort;
        float kesir = 2.3f;
        byte newkesir = (byte)kesir;
        System.out.println(newkesir);

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);

    }
}
