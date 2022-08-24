package day01_48.day09_ternary;

import java.util.Scanner;

public class odev1_GunNo {
    public static void main(String[] args) {
         /*
        Kullanicidan gün numarasi alip
        1 ise ptesi
        ....
        7 ise pazar yazdrlm
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();
        /*
        switch yazılan () neye göre case atayacagimizi gosterir
        java girilen degere case i bulur ve o satirdan çalışmaya baslar
        break yazısı görünceye kadar yazar
         */
        switch (gunNo) {
            case 1:
                System.out.println("Grilen gun pazartesidir.");
                break;
            case 2:
                System.out.println("Grilen gun Salıdır.");
                break;
            case 3:
                System.out.println("Girilen gun carsambadir.");
                break;
            case 4:
                System.out.println("Girilen gun persembedir.");
                break;
            case 5:
                System.out.println("Girilen gun cumadir.");
                break;
            case 6:
                System.out.println("Girilen gun cumartesidir.");
                break;
            case 7:
                System.out.println("Girilen gun pazardir.");
                break;
            default:
                System.out.println("Gerçerli Gün No'su giriniz");

        }
    }
}
