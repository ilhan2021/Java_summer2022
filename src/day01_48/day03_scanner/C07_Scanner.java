package day01_48.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz aralarda Enter tusuna basiniz");
        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        // girilen bilgiler = seyfi capar 34  seklinde yazdirin
        System.out.println("girilen bilgiler = "+isim+", "+soyisim+", "+yas);

    }
}
