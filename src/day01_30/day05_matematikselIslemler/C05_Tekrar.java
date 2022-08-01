package day01_30.day05_matematikselIslemler;

import java.util.Scanner;

public class C05_Tekrar {
    public static void main(String[] args) {
        int sayi1= 10;
        sayi1 += sayi1;
        System.out.println("1.Sayınızın değeri şuan: " +sayi1);//20
        int sayi2= ++sayi1;
        System.out.println("2. Sayınızın değeri şuan: " +sayi2);//21
        sayi2 += sayi1;
        System.out.println("2. Sayınızın değeri şuan: " +sayi2);//42

        //RAKAMLAR TOPLAMI
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 basamaklı bir şifre giriniz:");

        int sayi= scan.nextInt();
        int birlerBsmgi= 0;
        int rakmlrTop= 0;

        birlerBsmgi= sayi%10;
        rakmlrTop= rakmlrTop+birlerBsmgi;
        sayi=sayi/10;

        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        birlerBsmgi=sayi%10;
        rakmlrTop +=birlerBsmgi;
        sayi=sayi/10;
        System.out.println("girilen sayinin rakamlar toplami:"+rakmlrTop);




    }
}
