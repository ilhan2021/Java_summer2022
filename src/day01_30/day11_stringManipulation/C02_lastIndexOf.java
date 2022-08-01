package day01_30.day11_stringManipulation;

import java.util.Scanner;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle = "Java cok kolay, Java cok guzel";
        Scanner scan = new Scanner(System.in);
        String kelime = scan.next();
        /* Verilen kelime için aşagıdaki şartlardan uygun olanı yazın
            - verilen kelime kullanılamamış
            - verilen kelime cumlede 1 kere kullanılmış
            - verilen kelime 1 den fazla kullanılmış
         */
         int kelimeIlkIndex= cumle.indexOf(kelime);
        System.out.println("kelimeIlkIndex = " + kelimeIlkIndex);
         int kelimeSonIndex= cumle.lastIndexOf(kelime);
        System.out.println("kelimeSonIndex = " + kelimeSonIndex);

         if (kelimeIlkIndex==-1){
             System.out.println("verilen kelime kullanılmamış");
         } else if (kelimeIlkIndex==kelimeSonIndex) {
             System.out.println("verilen kelime cumlede 1 kere kullanılmış");
         }else{
             System.out.println("verilen kelime 1 den fazla kullanılmış");
         }
    }
}
