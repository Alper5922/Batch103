package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
    1) Farklı sayılardaki parametrelerle bir metod oluşturmak isterseniz VARARGS kullanmalısınız
    2) Varargs arka tarafta Array kullanır. Bu yüzden Varargslar ile çalışırken Array lerle çslışıyormuş gibi davranabilrsiniz
    3) Varargs oluşturmak için "<data type>...  <varargs ismi>"   veya  "<data type>  ...<varargs ismi>"
    4) Varargs sonda olmak şartıyla başka paranetre kullanılabilir. Çünkü Varargs dipsiz kuyu gibidir.
    5) Bir metotda birden fazla Varargs kullanılabilir mi? Varargs en sonda olmak zorunda olduğundan, birden fazla kullanırsanız
       en az biri en sonda olmayacaktır. bu da 4. kural ile çelişir
     */

    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1); //5

        int r2 = add(2,3,4);
        System.out.println(r2); //9

    }

    /*//2 sayının toplamını veren metod yazınız
    public static int add(int a, int b) {
        return a + b;
    }

    //3 sayının toplamını veren metod yazınız

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //4 sayının toplamını veren metod yazınız

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    //İstediğimiz kadar sayıyı toplayacağımız bir metod oluşturabiliriz
    public static int add(int... a) {
        int sum = 0;

        for (int w : a) {
            sum += w;
        }
        return  sum;
    }

}
