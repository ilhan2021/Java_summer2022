package day01_48.day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
       /* Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz:");
        String sifre = scan.nextLine();

        int kontrol = 0;
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("ilk harf büyük harf olmalı");
        }

        if(sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("son harf kucuk olmalı");
        }

        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk içermemeli");
        }else {
            kontrol++;
        }

        // sifre uzunluk knptrolu

        if(sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("sifre en az 8 karakter olamlı");
        }
        if(kontrol==4){
            System.out.println("sifreniz basarı ile olusturuldu");
        }else {
            System.out.println("islem basarısız lütfen yeniden deneyin");
        }
    }
}
