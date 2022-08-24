package day01_48.day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {
        /*
        Soru3) kullanicidan

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gun giriniz");
        String girilenGun = scan.next().toLowerCase();
        //kullanıcıonın ne girdiğini bilemeyiz. o nedenele hepsini küçük harf yaptık (tolowercase) ile
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi") ){
            System.out.println("girilen gun hafta sonu");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                ||girilenGun.equals("cuma") ) {
            System.out.println("girilen gun hafta ici");
        }
       if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                ||girilenGun.equals("cuma") || girilenGun.equals("pazar")
                || girilenGun.equals("cumartesi"))){
            System.out.println("Lütfen geçerli Bir gün giriniz");

        }

    }
}
