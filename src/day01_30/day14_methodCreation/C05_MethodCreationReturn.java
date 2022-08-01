package day01_30.day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        // kullanicidan sehir ismi ve dogum tarıhını alın
        // bunları programda kullanacağimiz formatta bize döduren bir methıd oluşturun
        //Şehir isminı  progrmaimiza büyük harf olarak
        // tarihi ise yıl.ay.gun olarak yazin
        String sehir = sehirAl();
        String tarih = tarihAl();
          System.out.println("sehir = " + sehir);
          System.out.println("tarih = " + tarih);
        
    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Şehir Giriniz");
        String sehir = scan.nextLine().toUpperCase();


        return sehir;
    }


    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 && yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Yıl için geçerli bir sayi yazmalisiniz(1900-2100)");
        }

        System.out.println("Kacıncı Ay oldugunu tamsayi olarak yaziniz: ");
        int ay = scan.nextInt();

        if (ay < 0 && ay > 12) {
            System.out.println("Ay için gecerlı bır tarıh yazınız (1-12)");

        } else if (ay<10){
            tarih = tarih +"0"+ ay + "-";
        }else {
            tarih = tarih+ ay + "-";
        }
        System.out.println("Kaçıncı gun oldugunu tamsayı olarak yazın: ");
        int gun = scan.nextInt();
        if (gun < 01 && gun > 31) {
            System.out.println("gun için gecerlı bır tarıh yazınız (1-31)");

        } else if (gun<10){
            tarih= tarih +"0"+gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;
    }
}
