package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriinz");
        byte yas = input.nextByte();
        if (yas < 0) {
            System.out.println("Geçerli yaş giriniz");
        } else if (yas < 5) {
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Çocuk");
        } else if (yas < 21) {
            System.out.println("Genç");
        } else if (yas < 31) {
            System.out.println("yetişkin");
        } else{
            System.out.println("Tanımlanmamış evre");
        }

    }
}
