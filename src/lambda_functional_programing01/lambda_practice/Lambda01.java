package lambda_functional_programing01.lambda_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));
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
    //TODO task tek sayilarin  karesini buyukten kucuge
    public static void tekSayilarinKarsiniBuyuktenKucugeSirala(List<Integer> sayi){
        sayi.stream()// akisa alindi
                .filter(t->t%2 ==1)// teksayilar filitrelendi
                .map(t->t*t)// karesi alindi
                .sorted(Comparator.reverseOrder())// buyukten kucuge   sirali yapildi
                .forEach(Methodlarim::yazdir); //yazdirildi.
    }
    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {


    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {

    }
    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek){
        yemek.stream()// akisa alindi
                .sorted(Comparator// siralama aksiyonuna girildi
                        .comparing(t->t.toString()//herbir elemani stringe cevirir
                        .charAt(t.toString().length()-1))// son karakter alındı
                        .reversed())// son harfine  göre tersten siralandi
                .forEach(Methodlarim::yazdir);


    }
    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        // ilkel yazim
        boolean kontrol = yemek.stream().allMatch(t->t.length()<=7);
        if(kontrol){
            System.out.println("list elemanlari 7 ve daha az harften olusmus");
        }else System.out.println("Bazi elemanlar 7 den buyuk");

        // moder yazim java 8 faydalari
        System.out.println(yemek.stream()
                .allMatch(t -> t.length() <= 7) ? "ist elemanlari 7 ve daha az harften olusmus" : "Bazi elemanlar 7 den buyuk");
    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }
    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {
    }
    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.

        Stream<String> sonIsım = // limit kullandiğimiz için bir objeye tanimladik
                yemek.stream()// akisa alindi
                .sorted(Comparator.comparing(t->t.toString().length())//sıralamayı length'e göre yaptık
                        .reversed())//tersine sirlama yaptık
                .limit(1);// limit (1) yazınca ilk elemani ile sinirledik
        System.out.println( //data tipi streamdi array' cevrildi
                Arrays.toString// array olanlari stringe donusturup yazdirmamizi sağladik
                        (sonIsım.toArray()));// strem tipi array e cevrildi
    }
    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    }
}


