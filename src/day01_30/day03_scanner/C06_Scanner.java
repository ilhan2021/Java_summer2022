package day01_30.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanicidan isim soyisim ve yaşini alip girilen bilgiler
        // girilen bilgiler = ilhan ilhan 44 seklindeyazalim

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        /*
        String isimleri scanner ile alırken
        next(): ilk bosluga kadar olan kismi (1kelime) alir
        nextLine():satirin sonuna kadar ne varsa alir
        Not: eger birden fazla string değer alacaksak nextLine() kullanmalıyız
         */

        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        double yas=scan.nextDouble();
        // girilen bilgiler= seyfi carpar 34 seklinde yazdirin
        System.out.println("girilen bilgiler =" +isim+ " " +soyIsim+", " +yas);
    }
}
