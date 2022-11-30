package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str ="123";
        int result = convertStringToInt(str);
        System.out.println(result + 5);

        String st = "1a2b";
        int r = convertStringToInt(st); // NumberFormatException : Eğer içinde rakamdan farklı bir karakter barındıran bir Stringi
        System.out.println(r);           //                        valueOf kullanarak Integer'a çevirmek isterseniz bu hatayı alırsınız
    }
    public static int convertStringToInt(String str){
        int i =0;

        // Her hangi bir satırda "Exception" atılırsa Java direk "catch" bölümne geçer, try içindeki sonrkai kodlar çalıştırılmaz.
        try{
            i =  Integer.valueOf(str);
            System.out.println("Burası TRY bölümü");

        }catch (NumberFormatException e){
            System.err.println("Rakam olmayan karakter içeren Stringler Integer'a çevrilemez");
        }
        return i;

    }
}
