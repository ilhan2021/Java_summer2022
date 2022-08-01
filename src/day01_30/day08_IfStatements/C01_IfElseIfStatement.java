package day01_30.day08_IfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatement {
    /*
    Kullanicidan gun ismi yazmasini isteyin Girilen isim gecerli gun ise
    gun isminin ilk uc harfini buyuk digerlerini kucuk yazdirin Gun ismi gecerli
    degilse "gecerli gun ismi giriniz" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gecerli Bir Gun İsmi Giriniz:");
        String gunIsmi = scan.next().toLowerCase();
        if ((gunIsmi.equals("pazartesi")) || (gunIsmi.equals("paz"))){
            System.out.println("Paz");
        } else if (gunIsmi.equals("sali")){
            System.out.println("sal");
        } else if (gunIsmi.equals("carsamba")){
            System.out.println("car");
        } else if (gunIsmi.equals("persembe")){
            System.out.println("Per");
        } else if ((gunIsmi.equals("cuma"))||(gunIsmi.equals("cumartesi"))){
            System.out.println("Cum");
        }  else {
            System.out.println("Lütfen Geçerli Bir Gün Giriniz");
        }

    }
}
