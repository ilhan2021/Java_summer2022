package day01_48.day08_IfStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {
        /* Artik yil hesaplaması
        1- 4 e bölünemeyen yıllar artık yıldır
        2- 4 e bölünüp 100 bölünemeyen yıllar artık yıldır
        3- 4 ' bölünüp 100ile bölünen sayılardan sadece 400 ün katları artık yıldır.
         */
        int aYil = 2003;
        if(aYil%4 !=0){
            System.out.println("Girilen yıl artık yıl degildir");
        } else if (aYil%4 == 0) {
            System.out.println("Girilen yıl artık yıldır");
            } else if (aYil%10 != 0) {
            System.out.println("Girilen yıl artık yıldır");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yil Giriniz");
        int yil = scan.nextInt();
        if(yil%4 !=0){
            System.out.println("artik yil değil");
        } else if (yil%100 !=0) {
            System.out.println("artik yil");
        } else if (yil%400 !=0) {
            System.out.println("artik yil değil");

        }else {
            System.out.println("artik yil");
        }

    }
}
