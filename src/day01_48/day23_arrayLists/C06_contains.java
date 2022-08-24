package day01_48.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.contains("Nutella"));//treu
        System.out.println(urunler.contains("Hobby"));//false

        List<String> urunler2 = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");


        System.out.println(urunler.containsAll(urunler2));//true

        urunler.add("Hobby");
        System.out.println(urunler.containsAll(urunler2)); //false







    }
}
