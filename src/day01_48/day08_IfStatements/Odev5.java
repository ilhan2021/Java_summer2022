package day01_48.day08_IfStatements;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
    Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
    Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
    Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
    Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi = scan.nextInt();
        // sayinin 5'e bölünüp bölünmemesi
        // sayinin son basamağinin 0 olup olmamasi
        if (sayi<1000 || sayi>9999){
            System.out.println("Girdiğiniz sayi 4 basamakli degil!!!");
        }else if(sayi%5==0){
             if (sayi%10==0) {
                 System.out.println("Sayi 5'e Bölünebilen çift Sayidir");

        } else {
                 System.out.println("Sayi 5'e Bölünebilen tek Sayidir");

            }
        }else {
            System.out.println("sayi 5'e bölünemiyor");
        }
    }
}
