package day01_48.day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir
        int --> Integer
        char --> Character
        digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String str = "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase());   // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi = true;
        // guzelMi. boolean primitive olduğundan hazır metod yoktur

        Boolean buGuzelMi = true;
        buGuzelMi.toString();
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32768

        String ogrNo = "123456";
        //Kullanıcıdan bir sifre alalim
        //eğer sıfre sadece rakamlardan olusuyor ise kabul etmeyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 5 basamaklı sayi giriniz");

        String sifre = scan.nextLine();
        Integer sifreSayi = Integer.parseInt(sifre);
        System.out.println("girilen sifre:" + sifre);
        System.out.println("Integer sifre:" + sifreSayi);
        System.out.println("girilen sifrenin 3 fazlasi :" + (sifre + 3));
        System.out.println("Integer sifrenin 3 fazlasi :" + (sifreSayi + 3));
        /*
        Wrapper class'lar ilerde kullanabilecegimiz
         pekcok faydali hazir method icerir
         */
    }
}
