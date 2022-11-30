package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
//JAVA "NESTED" KOD ÇALIŞTIRIKEN  ÇOK ZAMAN HARCAR. BUNA "TIME COMPLEXİTY" DENİR.BU YÜZDEN MÜMKÜNSE NESTED KOD YAZILMAMAYA ÇALIŞIRIZ
        /*
        Password'un ilk harfi buyuk harf ise
              'A' olursa gecerli password aksi halde gecersiz password
        Password'un ilk harfi kucuk harf ise
              'z' olursa gecerli password aksi halde gecersiz password
        */

        // HER DEFASINDA BAKKALA GİDEN ÇOCUK
        String pwd = "zxy12!";
        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("şifre geçerli");
            } else {
                System.out.println("Geçersiz Şifre");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("şifre geçerli");
            } else {
                System.out.println("Geçersiz Şifre");
            }

        }else {
            System.out.println("İlk karakter harf olmalıdır");
        }
        //2.YOL
        String pwdL = "5xy12!";

        char ilkHarf = pwdL.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){


            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else if(ilkHarf>='a' && ilkHarf<='z'){


            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else{

            System.out.println("Ilk karakter harf olmalidir");

        }
    }
}
