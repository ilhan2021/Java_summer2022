package day01_48.day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan İsmini isteyin
        //girilen İsmi
        //İsminiz: İlhan şeklinde yazdırın
        //insanların dünyasından kodlarimşzşn class'a değer almak için
        //Scanner ismini kullanırız

        //1- Scanner  objesi olusturalim
        Scanner scan = new Scanner(System.in);

        //2- Kullanıcıdan ne istedigimizi soyleyelim
        System.out.println("lütfen isminizi giriniz");

        //3-olusturduğumuz scan objesi ile kullanıcının girdigi degeri alip
        //  olusturduğumuz uygun bir variable a atayalim
         String kullaniciIsmi =  scan.next();
        System.out.println("Isminiz:" + kullaniciIsmi);
    }
}
