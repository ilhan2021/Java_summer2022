package day01_48.day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        /*
         kullanıcıdan 100 üzerinden not girmesini isteyin ve girilen notu harf sistemine cevirip yazdirin.
        50 den kucukse "D",
        50-60 arası ise "C",
        60-80 arası ise "B",
        80-100 arası ise "A"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar olan bir not değeri giriniz");
        double note = scan.nextDouble();

        if(note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note<50) { // bu satırda notlAR 0-100 ARASINDADIR
            System.out.println("Notunuz: D");
        } else if (note<60) { // bu satira geldi isek notunuz 50-100 arasindadir
            System.out.println("Notunuz: C");
        } else if (note<80) { // bu satirda isek notlar 60- 100 arasindadir.
            System.out.println("Notunuz : B");
        } else  {
            System.out.println("Notunuz: A");
        }
    }
}
