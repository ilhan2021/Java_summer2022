package practice.practice_3;

import java.util.Scanner;

public class Q05_StringManipulastion {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsim ve Soyisim Giriniz:\nisim");
        String isim = scan.next();
        System.out.println("Soyisim");
        String soyIsim = scan.next();

        if(isim.length()==soyIsim.length()){
            System.out.println("isminiz ile soyisminiz eşitler");
        } else if (isim.length()>soyIsim.length()) {
            System.out.println("isminiz soyisminizden uzundur");
        }else System.out.println("soyisminiz isminizden uzundur");
    }
}
