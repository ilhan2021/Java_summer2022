package recap02;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        int birlerBas = sayi % 10, onlarBas = (sayi / 10) % 10, yuzlerBas = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("yuz\t");
                    break;
                case 2:
                    System.out.print("ikiyuz\t");
                    break;
                case 3:
                    System.out.print("üçyuz\t");
                    break;
                case 4:
                    System.out.print("dörtyuz\t");
                    break;
                case 5:
                    System.out.print("besyuz\t");
                    break;
                case 6:
                    System.out.print("altıyuz\t");
                    break;
                case 7:
                    System.out.print("yediyuz\t");
                    break;
                case 8:
                    System.out.print("sekizyuz\t");
                    break;
                case 9:
                    System.out.print("dokuzyuz\t");
                    break;
            }
            switch (onlarBas) {
                case 1:
                    System.out.print("on\t");
                    break;
                case 2:
                    System.out.print("yirmi\t");
                    break;
                case 3:
                    System.out.print("otuz\t");
                    break;
                case 4:
                    System.out.print("kırk\t");
                    break;
                case 5:
                    System.out.print("elli\t");
                    break;
                case 6:
                    System.out.print("altmış\t");
                    break;
                case 7:
                    System.out.print("yetmiş\t");
                    break;
                case 8:
                    System.out.print("seksen\t");
                    break;
                case 9:
                    System.out.print("doksan\t");
                    break;

            }
            switch (birlerBas) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üc");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }
        }else{
            System.out.println("Lütfen 3 basamaklı sayı giriniz:");

        }
    }
}