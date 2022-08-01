package day01_30.day07_ifStatements;

import java.util.Scanner;

public class C10_IfElseIfOdev {
    /*
    Kullanıcıdan iki sayi alın ve ikisayi da pozitif ise TOPLAMLARINI;
                                  ikisayi da negatif ise CARPİMLARİNİ;
    iki sayida farkli işarette ise "farkli isaretli sayilarla islem yapamazsin"
    eger sayilardan sifira esit olan var ise"sifir carpmada yutan elemandir" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet tam sayi giriniz:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>0 && b>0){
            System.out.println("Girilen Sayilar Toplami:"+ (a+b));
        } else if (a<0 && b<0) {
            System.out.println("Girilen Sayilar Carpimi:"+ a*b);
        } else if (a<0 || b<0) {
            System.out.println("Farkli Isaretli Sayilarla Islem Yapamazsin:");
        } else if (a==0 || b==0) {
            System.out.println("Sifir Carpmaya Gore Yutan Elemandir.");
        }
    }
}
