package alıstırmalar;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim=scan.nextLine();
        System.out.println("isiminizin bas harfi :" + isim.charAt(0));

    }
}
