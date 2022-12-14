package lambda_functional_programing01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    /*
        1-) Lambda (Functional Programming) Java 8 ile kullanilmaya baslanmistir.
        2-) Functional Programming'de "Ne yapilacak?(What to do?)" uzerine yogunlasilir.
        Structured Programming'de "Nasil Yapilacak?(How to do?)" uzerine yogunlasilir.
        3-) Functional Programming Arrays ve Collections ile kullanilir.
        4-) "entrySet() methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir.

         */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        System.out.print("functional: ");
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.print("functional: ");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        System.out.print("functional: ");
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        System.out.print("functional: ");
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        System.out.print("functional: ");
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        System.out.print("functional: ");
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        System.out.print("functional: ");
        getMaxEleman01(liste);
        System.out.println();
        System.out.print("functional: ");
        getYedidenBuyukCiftMin(liste);
        System.out.println();
        System.out.print("functional: ");
        getYedidenBuyukCiftMin(liste);
        System.out.println();
        System.out.print("functional: ");
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }
    //1) Ard??????k list elementlerini ayn?? sat??rda aralar??nda bo??luk b??rakarak yazd??ran bir method olu??turun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            System.out.print(w+ " ");

        }
    }

    //1) Ard??????k list elementlerini ayn?? sat??rda aralar??nda bo??luk b??rakarak yazd??ran bir method olu??turun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection'dan elementleri ak????a dahil etmel i??in ve methodlara ula??mak i??in kullan??l??r.

    }
    //2)Ard??????k ??ift list elemanlerini ayn?? sat??rda aralar??nda bo??luk b??rakarak yazd??ran bir method olu??turun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            if (w%2==0){
                System.out.print(w + " ");
            }

        }

    }
    //2)Ard??????k ??ift list elemanlerini ayn?? sat??rda aralar??nda bo??luk b??rakarak yazd??ran bir method olu??turun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t ->t%2==0).forEach(t-> System.out.print(t+ " "));
    }
    //3) Ard??????k tek list elementlerinin karelerini ayn?? sat??rda aralar??nda bo??luk
    // b??rakarak yazd??ran bir method olu??turun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
        //Elemanlar??n de??erleri de??i??ecekse map() methodu kullan??l??r.
    }
    //4) Ard??????k tek list elementlerinin k??plerini tekrars??z olarak ayn?? sat??rda aralar??nda
    // Bo??luk b??rakarak yazd??ran bir method olu??turun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t ->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+ " "));
    }

    //5) Tekrars??z cift elementlerin karelerinin toplam??n?? hesaplayan bir method olu??turun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
        Integer toplam =list.stream().distinct().filter(t ->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
    //6) Tekrars??z ??ift elemanlar??n k??p??n??n ??arp??m??n?? hesaplayan bir method olu??turun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
        Integer carpim = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u);
        System.out.println(carpim);
    }
    //7) List elemanlar?? aras??ndan en b??y??k de??eri bulan bir method olu??turun.
    //1. Yol:
    public static void getMaxEleman01(List<Integer> list){
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u );
        System.out.println(max);
    }
    //2. Yol:
    public static void getMaxEleman02(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
        System.out.println("max = " + max);
    }
    //??dev
    //8)List elemanlar?? aras??ndan en k??????k de??eri bulan bir method olu??turun.(2 Yol ile)






    //9) List elemanlar?? aras??ndan 7'den b??y??k, ??ift, en k??????k de??eri bulan bir method olu??turun.
    //1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list){
        Integer min =  list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println(min);
    }
    //2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){
        Integer min = list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){
        Integer min = list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }
    //10) Ters s??ralama ile tekrars??z ve 5'ten b??y??k elemanlar??n yar?? de??erlerini(elaman??n ikiye b??l??m sonucunu) bulan bir method olu??turun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
        List<Double> sonuc =  list.stream().distinct().filter(t-> t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(sonuc);
    }

}
