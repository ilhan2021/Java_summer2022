package day01_30.day10_stringManipulation;

import java.util.Scanner;

public class C08_IndexOfOdev {
    public static void main(String[] args) {
        /* Verilen kelime için aşagıdaki şartlardan uygun olanı yazın
            - verilen kelime kullanılamamış
            - verilen kelime cumlede 1 kere kullanılmış
            - verilen kelime 1 den fazla kullanılmış
         */
        String cumle = "Java cok kolay, Java cok guzel";
        Scanner scan = new Scanner(System.in);
        String kelime = scan.next();
        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1){
            System.out.println("cumle de bu kelime kullnılmamıs");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("cumle de bu kelime 1 kere kullanilmis");
        }else{
            System.out.println(" cumlede kelime 1 den fazla kullanılmiş");
        }

    }
}
