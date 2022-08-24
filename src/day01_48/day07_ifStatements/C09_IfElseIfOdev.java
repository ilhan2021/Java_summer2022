package day01_48.day07_ifStatements;

import java.util.Scanner;

public class C09_IfElseIfOdev {
    /*
    Kullanicidan gun ismi yazmasini isteyin Girilen isim gecerli gun ise
    gun isminin ilk uc harfini buyuk digerlerini kucuk yazdirin Gun ismi gecerli
    degilse "gecerli gun ismi giriniz" yazdirin
     */
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gecerli Bir Gun İsmi Giriniz:");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("pazartesi")){
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());

        } else if (gunIsmi.equals("sali")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else if (gunIsmi.equals("carsamba")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else if (gunIsmi.equals("persembe")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else if (gunIsmi.equals("cuma")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else if (gunIsmi.equals("cumartesi")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else if (gunIsmi.equals("pazar")) {
            System.out.println("gunIsmi="+gunIsmi.substring(0,1).toUpperCase()+gunIsmi.substring(1,3).toLowerCase());
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }
    }
}
