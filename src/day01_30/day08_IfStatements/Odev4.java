package day01_30.day08_IfStatements;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        // Kullanicidan bir Şifre isteyin
        //-eğer ilk harf buyukse "A" olup olmadigi kontrol edin. ilk harf "A" ise
        // gecerli sifre degilse gecersiz yazin
        // -eger ilk harf kucuk "z" olup olmadıgını kontrol edin. ilk harf "z" ise
        // sifre gecerli degilse gecersiz yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Sifre Giriniz:");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Geçerli Sifre");
            } else {
                System.out.println("Geçersiz Sifre");}
            }else if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                 if(ilkHarf=='z'){
                System.out.println("Geçerli Sifre");
                 } else System.out.println("Geçersiz Sifre ");
        } else {
            System.out.println("Lutfen Tekrar Deneyin");
        }

    }
}
