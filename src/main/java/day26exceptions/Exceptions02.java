package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2); // v
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium", 8); // v
        System.out.println(ch2);  // Bir Stringden karakter veya karakterler alırken olmayan bir indeks kullanılırsa(istenirse)
        // StringIndexOutOfBoundsException alınır.

    }

    public static char getCharFromString(String str, int idx) {

        char c = ' ';

        try {
            c = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("indeks ile ilgili bir problem oluştu /" + e.getMessage());

            e.printStackTrace(); // Detaylı "log" için.
        }

        return c;
    }
}
