package day01_30.day23_arrayLists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class odev01_04 {
    public static void main(String[] args) {
        // 01- Elemanlari A,C,E ve F olan bir String ArrayList oluşturup ekrana yazdirin
        List<String> elemanListesi = new ArrayList<>();
        elemanListesi.add("A");
        elemanListesi.add("C");
        elemanListesi.add("E");
        elemanListesi.add("F");
        System.out.println(elemanListesi);

        //02-indexsiz add method u kullanarak B'yi ekleyiniz
        //  index kullanarak L'yi ekleyiniz
        // ArrayList'i ekrana yazdiriniz Liste; A, L, C, E, F, B,

        elemanListesi.add("B");
        elemanListesi.add(1,"L");
        System.out.println(elemanListesi);

        //03- set methodu kullanarak E'yi D'yapin ArrayList’i ekrana yazdiriniz,
        // list goyle olmalı; A, L, C, D, F, B.

        elemanListesi.indexOf("E");
        // System.out.println(elemanListesi.indexOf("E"));//3
        elemanListesi.set(3,"D");
        System.out.println(elemanListesi);//[A, L, C, D, F, B]
        // veya
        //elemanListesi.set(elemanListesi.indexOf("E"),"D");
        //System.out.println(elemanListesi);

        //04- remove() methodu kullanarak, F’yi siliniz.ArrayList’i ekrana yazdiriniz,
        //   list boyle olmali; A, L, C, D, B.
        elemanListesi.remove(elemanListesi.indexOf("F"));
        System.out.println(elemanListesi);//[A, L, C, D, B]


        //05- sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L
        Collections.sort(elemanListesi);
        System.out.println(elemanListesi);//[A, B, C, D, L]

        //06-contains() methodu kullanarak, L’nin list'de var olduğunu ve
         // M’nin list'de var olmadigini dogrulayiniz.

        System.out.println("L harfi listemizde var mı? :"+ elemanListesi.contains("L"));
        System.out.println("M harfi listemizde var mı? :"+ elemanListesi.contains("M"));

        //07- size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.

        System.out.println("Listemizdeki Eleman sayimiz : "+elemanListesi.size()+" tanedir");

        //08- clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        //09- isEmpty() methodu kullanarak, list’deki tum elemanlarin silindiğini dogrulayiniz
        System.out.println("Listemiz bos mu :" + elemanListesi.isEmpty());
        elemanListesi.clear();
        System.out.println("Listemiz bos mu :" + elemanListesi.isEmpty());





    }
}
