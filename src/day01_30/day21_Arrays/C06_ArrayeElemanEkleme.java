package day01_30.day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // c05 teki methodu kullanarak array'e eleman ekleme
        String [] takimListesi = {"Suleyman","Osman"};
        String eklenecekIsim ="Talha";

        takimListesi = C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
