package day01_48.day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cekirdek");
        urunler2.add("Cay");

        System.out.println(urunler.equals(urunler2));//false --urunler aynı oldugu halde false vermesi siralama
                                                     // farklı oldugu icin false dondu
        Collections.sort(urunler);
        //System.out.println(urunler);
        Collections.sort(urunler2);
        //System.out.println(urunler2);
        System.out.println(urunler.equals(urunler2)); // true




    }
}
