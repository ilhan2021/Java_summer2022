package practice.practice_3;

import java.util.Scanner;

public class Q01_StringManipulaton {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle oluşturmak için birinci kelimeyi giriniz:");
        String kelime1 = scan.next().toLowerCase();
        System.out.println("Lutfen cumle oluşturmak için ikinci kelimeyi giriniz:");
        String kelime2 = scan.next().toLowerCase();
        System.out.println("Lutfen cumle oluşturmak için üçüncü kelimeyi giriniz:");
        String kelime3 = scan.next().toLowerCase();
        System.out.println("Lutfen cumle oluşturmak için dördüncü kelimeyi giriniz:");
        String kelime4 = scan.next().toLowerCase();

        System.out.println(kelime1.substring(0,1).toUpperCase() + kelime1.substring(1)+" "+kelime2
        +" "+ kelime3+" "+kelime4+".");
    }
}
