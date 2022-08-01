package day01_30.day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gün numarasi alip
        1 ise ptesi
        ....
        7 ise pazar yazdrlm
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();
        /*
        switch yazılan () neye göre case atayacagimizi gosterir
        java girilen degere case i bulur ve o satirdan çalışmaya baslar
        break yazısı görünceye kadar yazar
         */
        switch (gunNo){
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("geçerli gun numarasi giriniz");

        }
    }
}
