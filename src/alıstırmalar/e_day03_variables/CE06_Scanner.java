package alıstırmalar.e_day03_variables;

import java.util.Scanner;

public class CE06_Scanner {
    public static void main(String[] args) {
        //Kullanicidan isim soyisim ve yaşini alip girilen bilgiler
        // girilen bilgiler = ilhan ilhan 44 seklindeyazalim
        Scanner scan = new Scanner(System.in);
        System.out.println("İsim Giriniz:");
          /*
        String isimleri scanner ile alırken
        next(): ilk bosluga kadar olan kismi (1kelime) alir
        nextLine():satirin sonuna kadar ne varsa alir
        Not: eger birden fazla string değer alacaksak nextLine() kullanmalıyız
         */
        String isim=scan.nextLine();
        System.out.println("Soyismi Giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Yası giriniz");
        double yas= scan.nextDouble();
        System.out.println(isim+""+soyisim+""+yas);
    }
}
