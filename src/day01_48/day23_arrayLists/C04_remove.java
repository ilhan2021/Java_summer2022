package day01_48.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        /*
        remove mtehod'u iki şekilde kullanilir
        1- objeyi silmesini istersek bize boolean sonuc doner -- (urunler.remove("Ikram")) için True/false doner
        2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */

        // Birinci Yontem

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));// true
        System.out.println(urunler); //[Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby"));// false
        System.out.println(urunler); //[Nutella, Cekirdek, Cay]


        // İkinci Yontem

        System.out.println(urunler.remove(1));// Cekirdek
        System.out.println(urunler); //[Nutella, Cay]

        // Olmayan bir index i silmeye calisirsak?

        //System.out.println(urunler.remove(3)); //IndexOutOfBoundsException -- Hatası doner




    }
}
