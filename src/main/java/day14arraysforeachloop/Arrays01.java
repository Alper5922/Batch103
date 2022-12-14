package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Array'lerin içine sadece "primitive" data tipleri konulabilier
    public static void main(String[] args) {
        String str[] = new String[4];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));

        ///String bir Array olusturunuz ve  "Tom" ve "Tom" dan onceki
        // tum elemanlari ekrana yazdiriniz
        String arr[] ={"Jane", "Mark", "christoper" , "Tom", "Ali", "Rojda"};
        for (String w : arr){
            System.out.print(w+ " ");

            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric
        // tum elemanlari ekrana yazdiriniz
        String brr[] ={"Jane", "Mark", "christoper" , "Tom", "Ali", "Rojda"};
        for (String q : brr ){
            if (q.equals("Tom") || q.equals("Jane") ){
                continue;

        }System.out.print(q +" ");
        }
        System.out.println();
        // EX 3 ) kullanıcı ile beraber bir Array  oluşturunz. Ve içine data ekleyiniz
        //(Bir öğretmenin sınıfındaki öğrencilerin isimlerini  applicatona yüklemesini sağlayan kodu yazınız)
        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");



        for(int i=1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");

            String stdName = input.next();


            if(stdName.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdName;

        }
        System.out.println(Arrays.toString(names));

    }
}
