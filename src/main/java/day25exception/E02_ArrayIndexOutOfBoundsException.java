package day25exception;

public class E02_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr,2); //Veli
        getElementFromArray(arr,0); //Ali
        getElementFromArray(arr,4); //ArrayIndexOutOfBoundsException

    }
    // Bir String Array'den index girerek eleman elde edebilmek için bir metod oluşturun
    public static void getElementFromArray(String arr[], int idx) {

        try {
            System.out.println(arr[idx]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){

            System.err.println("Array indekste bir problem meydana geldi"); // Teknik olmayan açıklamam  -->err yerine out da yazılabilirdi

            e.printStackTrace(); // Excxeption ile ilgili detaylı teknik mesaj verir
        }
    }

}
