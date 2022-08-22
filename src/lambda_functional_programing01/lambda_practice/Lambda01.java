package lambda_functional_programing01.lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda01 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih","ersin","mevlit"));

    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));

    public static void aHarfleriniSilenGerisiniYazdiran(ArrayList<String>isimler){
        ////1.yol
        //System.out.println(isimler.stream()// akisa alindi
        //        .map(t -> t.toLowerCase()) // hepsi küçük harf yapıldı
        //        .filter(t -> !t.contains("a"))// a harfi filitrelendi
        //        .collect(Collectors.toList()));// liste atıldı

        //// 2.yol
        //System.out.println(isimler.stream()// akisa alindi
        //        .filter(t -> !t.contains("a")&&!t.contains("A"))// a harfi filitrelendi
        //        .collect(Collectors.toList()));// liste atıldı
        // 3. yol
        isimler.removeIf(t->t.contains("a") || t.contains("A"));
        System.out.println(names);
    }
    // En buyuk Elemanı Bulun
    public static void enBuyukOlaniBul(List<Integer> sayi){
        Optional<Integer> enBuyukSayi = sayi.stream().reduce(Math::max);
        System.out.println("enBuyukSayi ="+ enBuyukSayi);
        System.out.println("sayi.stream().reduce(Integer::max) = " + sayi.stream().reduce(Integer::max));
        /*
        hocanın çözümü
        //en buyyk elemani bulun
public static void maxElemanBul(List<Integer> sayi){

    Optional<Integer> maxSayi=
            sayi.stream().
                    reduce(Math::max);
    System.out.println("maxSayi = " + maxSayi);
    //2.yol
    System.out.println("sayi.stream().reduce(Integer::max) = " + sayi.
            stream().
            reduce(Integer::max));//spesifik bir method cagirirsani daha hizli yani alirsinz
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
         */
    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    // Lambda Expression...
    public static void elemanlariTopla(List<Integer> sayilar){
        System.out.println("sayilar.stream().reduce(0,(a,b)->a+b) = " +
                sayilar.stream().reduce(1, (a, b) -> a + b));
        // 2.yol
        System.out.println("sayilar.stream().reduce(Integer::sum) = " +
                sayilar.stream().reduce(Integer::sum).get());

    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void elemanlariCarp(List<Integer> sayilar) {
        // lambda expression ile
        System.out.println("tüm sayilarin carpimi 2. yol : " +
                sayilar.stream().reduce(1, (a, b) -> a * b));
        // 2.yol
        System.out.println("cift sayilarin carpimi 2. yol: " +
                sayilar.stream().filter(Methodlarim::ciftElemanlariBul).reduce(1,(a, b) -> a * b));
    }
}

