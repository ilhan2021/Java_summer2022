package day01_30.day08_IfStatements;

import java.util.Scanner;

public class Odev2 {
    /*Klavyeden okunan bir karakterin (char) küçük harf olduğunun kontrolünü yaparak,
    bu harfin büyük harf karşılığını ekrana yazdıran programı Java dilinde yazınız.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        if (karakter >= 'a' && karakter <= 'z') {
            karakter = (char) (karakter - 32);
            System.out.println(karakter);


            String yeniKarakter = String.valueOf(karakter);

            System.out.println(yeniKarakter.toUpperCase());
        }
    }
}