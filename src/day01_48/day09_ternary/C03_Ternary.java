package day01_48.day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan alınan sayi
        // sayi poazitif ise yazdirin
        // negatifse bir sayi daha isteyip çarpimini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi);
        } else{
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);
            /*
            Eğer if else icerisinde yeni  kodlar varsa
            ternary ile yapmamız mümkün olmaz.
             */

        }
    }
}
