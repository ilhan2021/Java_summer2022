package lambda_functional_programing01;

import java.util.ArrayList;
import java.util.List;

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

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            System.out.print(w+ " ");

        }
    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection'dan elementleri akışa dahil etmel için ve methodlara ulaşmak için kullanılır.

    }
    //2)Ardışık çift list elemanlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for (Integer w:list) {
            if (w%2==0){
                System.out.print(w + " ");
            }

        }

    }
    //2)Ardışık çift list elemanlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t ->t%2==0).forEach(t-> System.out.print(t+ " "));
    }
    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
        //Elemanların değerleri değişecekse map() methodu kullanılır.
    }
    ///4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
    // Boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t ->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+ " "));
    }
    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
        Integer toplam =list.stream().distinct().filter(t ->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }

}
