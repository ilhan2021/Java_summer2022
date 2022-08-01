package day01_30.day16_for_loop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
        // tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı olarak bsaşlangıc degerlerini girin");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();
        aralariTopla(bas,bitis);

    }

    public static void aralariTopla(int bas, int bitis) {
        int toplam=0;
        if(bas<= bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam+=i;
            }
            }else{
                for (int i = bitis; i <=bas ; i++) {
                    toplam+=i;
                }
                 }
            System.out.println("Aradaki sayiların toplami :"+toplam);
    }
}

