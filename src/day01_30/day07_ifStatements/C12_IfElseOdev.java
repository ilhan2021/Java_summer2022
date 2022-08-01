package day01_30.day07_ifStatements;

import java.util.Scanner;

public class C12_IfElseOdev {
    /*
    Kullanicidan maas icin teklif isteyin ve asagidaki degerler gore cevap yazdirin.
    1- Teklif 80.000 uzeri ise "kabul ediyorum"
    2- 60-80 arasi ise "konusabiliriz"
    3- 60 dan az ise"maalesef kabul edemem" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Teklifi Giriniz");
        double teklif = scan.nextDouble();
        if(teklif<60.000){
            System.out.println("maalesef kabul edemem");
        } else if (teklif<80.000) {
            System.out.println("görüşebiliriz");
        } else  {
            System.out.println("kabul ediyorum");

        }
    }
}
