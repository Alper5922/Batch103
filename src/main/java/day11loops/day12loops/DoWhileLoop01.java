package day11loops.day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1) {                         //While loop bazi durumlarda hic
            System.out.println("While loop");// calismayabilir yani while loop icin
            i++;                             // "zero execution" mumkundur.
        }
        int k = 1;
        do {                                     // do-while-loop kullanildiginizda
            System.out.println("do-while-loop"); // loop body'si icinden kod en az
            k++;                                 // bir kere calisir.
        } while (k < 1);

        //EX-1) Bir ondalık sayının ondalık kısmının
        // rakamları toplamını bulunuz
        // 24,5673 ==> 5+6+7+3=23
        double num = 24.5673;

        String str = String.valueOf(num);   //String.ValueOf() parantezin içine konulanı ,string tipine çevirir

        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;
        do {

            sum = sum + decimalInt % 10;
            decimalInt = decimalInt / 10;
        } while (decimalInt > 0);
        System.out.println(sum);
    }
}
