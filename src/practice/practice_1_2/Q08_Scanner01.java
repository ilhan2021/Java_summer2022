package practice.practice_1_2;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk tamsayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("Lütfen ikinci tamsayiyi giriniz");
        int b = scan.nextInt();
        System.out.println("İki Sayinin toplami = " + (a+b));
    }
    
}
