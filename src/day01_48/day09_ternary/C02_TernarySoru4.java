package day01_48.day09_ternary;

import java.util.Scanner;

public class  C02_TernarySoru4 {
    public static void main(String[] args) {
        // Soru4 ) Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
        // eğer ternary içindeki sonuçlar farklı data  türünde ise
        // atama yapamayız sadece yazdırabilriz
        // double sonuc = sayi>0 ? "sayi pozitif" : (sayi+sayi) bu olmaz!!
        System.out.println(sayi > 0 ? "sayi pozitif" : (sayi + sayi));
    }
}
