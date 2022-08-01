package day01_30.day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        // Verilen bir array’e yeni bir element ekleyen method olusturun

        String [] sinifListesi = {"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi = new String[sinifListesi.length+1]; // [null,null,null,null] eski listeden 1
                                                                                    // uzunlukta yeni array yaptık
        for (int i = 0; i <sinifListesi.length ; i++) { //Eski listemizi yeniye ekledik
            yeniSinifListesi[i]=sinifListesi[i];
        }

        yeniSinifListesi[yeniSinifListesi.length-1] = eklenecekIsim; // yeni eklenecek ismi yeni listeye ekledik

        return yeniSinifListesi;
    }
}
