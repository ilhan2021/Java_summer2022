package day01_30.day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        // iki şekilde oluşturabiliriz
        int sayilar[]={1,2,3};
        String harfler[]=new String[4];
        System.out.println("sayilarin toplami:"+sayilar.length);//3
        // String length de (String.length()) var ama arrayde parantez yok
        System.out.println("harfler array inin uzunluğu:"+harfler.length);//4
        System.out.println(Arrays.toString(harfler));//[null,null,null,null]

        // harfler array in son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);//null

        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException
    }
}
