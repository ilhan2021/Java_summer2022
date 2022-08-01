package day01_30.day08_IfStatements;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
       /*
        Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak şekilde programı yazınız.

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu giriniz: ");
        double boy = scan.nextDouble();
        if (boy < 0 || boy > 230) {
            System.out.println("Lutfen yeniden giriniz");
        } else if (boy <= 175) {
            System.out.println("Kısa Boylusunuz");
        } else {
            System.out.println("Uzun Boylusunuz");
        }

    }
}
