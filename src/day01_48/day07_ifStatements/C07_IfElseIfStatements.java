package day01_48.day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise
         “emekli olamazsin, calismalisin”, 65’e esit veya buyukse
         “Emekli olabilirsin” yazdirin
         EGER KULLANİCİ NEGATİF DEĞER GİRERSE
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen Gecerli Bir Yas Giriniz");
        } else if (yas<65) {
            System.out.println("Emekli Olamazsin,"+(65-yas)+" yil daha calismalisin");

        } else  {
            System.out.println("Emekli olabilirsin");
        }
    }
}
