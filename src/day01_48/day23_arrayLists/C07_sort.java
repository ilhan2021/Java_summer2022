package day01_48.day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        //System.out.println("ilk siralama: "+urunler);
        //urunler.sort(String::indexOf);
        //System.out.println("List sira: "+ urunler);

        Collections.sort(urunler);
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort method'unda siralama ozelligi girmek gerekiyor
        bunun yerine Collections class'inda sort method'u kullaniyoruz
        bu method listemizi natural order'a gore siralar
         */
    }
}
