package day01_30.day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str = "Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

        System.out.println(str.charAt(22)); // indexOf = 21 olduğu için sistem hata verir.


        /*
         charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
         String method'larindan kullanmamiz gereken bir method varsa
         charAt( ) 'den once kullanmaliyiz

         */



    }
}
