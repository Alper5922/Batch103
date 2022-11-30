package deneme;

public class E {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6};
        try {
            System.out.print("Good");
            System.out.print(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Better");
        }
    }
}