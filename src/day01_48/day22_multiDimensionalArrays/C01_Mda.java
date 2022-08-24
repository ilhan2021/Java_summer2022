package day01_48.day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        -- Tek katlı arraylarde array'İ direk yazxdiramiyoruz
        -- cunku array non-primitive data turudur ve
           her non-primitve data direk yazdirilabiliyor

           --ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
           cunku  genelde primitive data turu ve string elementler kullaniliyordu

           Multi-Dimensional arraylerde en dikkat edeceğimiz konu
           ulaşmak istediğimiz bir array mi yoksa
           primitive data mı oldugudur
         */
        int[][] sayilar = {{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]
        ancak en icerdeki elementlere ulasairsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]);//[I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0]));//--[1, 2, 4, 5]
        System.out.println(sayilar[0][1]);//-- 2
        System.out.println(sayilar[1][0]);//-- 3
        System.out.println(Arrays.toString(sayilar));//--[[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar));// --[[1, 2, 4, 5], [3, 4]]
        /*
        array'i iki sekilde declare edebiliyorduk
         1- elemanlari direk yazabiliriz
         int[][] sayilar= {{1,2,4,5},{3,4}};
         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar= new int[3][4];
         ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz

         */

    }
}
