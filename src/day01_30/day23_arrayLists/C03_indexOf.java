package day01_30.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram")); // 1  -- Bize girilen urunun indexini verir. liste değişmez
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]


        /*

         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez

         */
        System.out.println(urunler.lastIndexOf("ikram")); // 1 -- Bize girilen urunun  indexini verir.

        /*
         indexOf method'u urunu aramaya 0.index'den,
         lastIndexOf method'u ise aramaya son index'den baslar.
         arama bitip, urun bulundugundugunda,
         ikisi de bulunan urunun index'ini verir
         */

        urunler.add("ikram");
        System.out.println(urunler);//  [Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("ikram")); // 1
        System.out.println(urunler.lastIndexOf("ikram")); // 4 -- lastaIndexOf sondan başlar  aranan urunu
                                                            // ilk buldugu indexi yazdirir


        System.out.println(urunler.indexOf("Hobby")); // -1
        System.out.println(urunler.lastIndexOf("Hobby"));// -1

        // Her iki method da olamayan urunu arayınca -1 döndürür.

    }
}
