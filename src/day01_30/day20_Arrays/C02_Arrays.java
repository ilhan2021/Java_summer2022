package day01_30.day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println("sayilar = " + sayilar);//[I@5f2050f6 oysa 0,0,0 olmalıydı
        // non-primitive data turundeki datalari
        // her zaman direk yazdirmaz
        // array'i yazdirmak istersek array classında isterriz
        System.out.println("sayilar = " + Arrays.toString(sayilar));// [0,0,0]
        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

        String sinifList[]={"Ali","ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); //[Ali,ayse,Ahmet]

        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList)); //[Ali,Hasan,Ahmet]

    }
}
