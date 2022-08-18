package lambda_functional_programing01;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

    /*
     1)  t-> "Logic" , (t, u)-> "Logic"
     Bu yapıya "Lambda Expession"
     2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
    "Lambda Expession" yerine "Method Reference" tercih edilir.
     3) "Method Reference" kullanımı "Class Name :: Method Name"

         Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
        Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
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
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsızTekElemanlarinKupleriniYazdir(liste);

    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //2)Ardışık çift list elemanlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında
    // Boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsızTekElemanlarinKupleriniYazdir(List<Integer> list){
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

}
