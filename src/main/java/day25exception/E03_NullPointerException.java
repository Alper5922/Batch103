package day25exception;

public class E03_NullPointerException {
    public static void main(String[] args) {

        String str = "ali";
        getNumOfChars(str);

        String str1 = "";
        getNumOfChars(str1);

        String str2 = null;
        getNumOfChars(str2); //NullPointerException
                             //Eğer length() metodunda "null" kullanırsanız "NullPointerException" alırsınız.
    }

    //Bir Stringde bulunan karakterlerin sayısını bulabilmek için bir metot yazınız

    public static void getNumOfChars(String str) {

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("length() metodunda problem"); // Teknik olmayan mesajım
            System.out.println( e.getMessage());  // Teknik mesaj
            e.printStackTrace();

        }

    }

}
