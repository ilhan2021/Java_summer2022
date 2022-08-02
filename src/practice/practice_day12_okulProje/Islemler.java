package practice.practice_day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList = new ArrayList<>();
    static List<Kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    //!!!!!!!!!!!!!!
    //!!!!!!!!!!!!!!!!

    public static void girisPaneli(){
        System.out.println("===============================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YONETİM PANELİ");
        System.out.println("===============================");
        System.out.println("1- OGRENCI ISLEMLERİ");
        System.out.println("2- OGRETMEN ISLEMLERİ");
        System.out.println("Q- CIKIS");

        String secim = scan.nextLine().toUpperCase();//kontrol buyuk harfle olacak

        switch(secim){
            case "1":
                kisiTuru="OGRENCI";

                break;
            case "2":
                islemMenusu();
                kisiTuru="OGRETMEN";


                break;
            case "Q":

                break;
            default:
                System.out.println("Hatali Gris");
                girisPaneli();
                break;

        }
    }

    private static void islemMenusu() {
        System.out.println("Sectigim kisi turu "+kisiTuru+ " icin lutfen asagıdaki islemleri seciniz:");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");
        System.out.println("islem tercihinizi giriniz:");
        int secilenIslem = scan.nextInt();
        switch(secilenIslem){
            case 1:
                ekle();
        }
    }
}