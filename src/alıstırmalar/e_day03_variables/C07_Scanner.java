package alıstırmalar.e_day03_variables;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adınızı soyadınızı ve yasınızı giriniz aralarda enter'a basınız");
        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("isiminiz:" +" "+isim+" " +"soyisminiz"+" "+soyisim+" ,"+"yasınız:"+yas);


    }
}
