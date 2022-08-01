package day01_30.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcının iki sayi alip
        bu sayilarin çarpimini yazdirin
         */

        //1- adim
        Scanner scan = new Scanner(System.in);
        //2- adim
        System.out.println("lütfen ilk sayiyi giriniz");
        //3- adim
        double sayi1= scan.nextDouble();
        // 2. sayi için 2. ve 3. adimlari tekra ediniz
        System.out.println("lütfen ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();
        System.out.println(("Girilen sayilarin carpimi : "+sayi1*sayi2));
    }
}
