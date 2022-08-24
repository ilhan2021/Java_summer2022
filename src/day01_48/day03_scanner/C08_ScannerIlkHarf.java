package day01_48.day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        /* kullanıcıdan ismini alıp ilk harfini büyük olarak yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        /*Java Scanner classında nextChar() metodu yoktur
        bunun yerine String olarak ilk kelimeyi alıp onunda
        ilk harfini alabiliriz

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi: "+ ilkHarf);*/
        /*

        // 1.Soru Kullanicidan iki sayi alip toplam fark ve carpimlarini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("Sayilarin Toplami="+(sayi1+sayi2));
        System.out.println("Sayilarin Farki="+(sayi1-sayi2));
        System.out.println("Sayilarin Carpimi="+(sayi1*sayi2));
        // 2.Soru Bir kenari verilen karenin çevrei ve alanını bulma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunluğunu giriniz ve Enter'a basiniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Karenin Cevresi="+sayi1*4);
        System.out.println("Sayilarin Farki="+sayi1*sayi1);

        // 3.Soru Yaricapi verilen cemberin çevresi ve dairenin alanını bulma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen çemberin yaricapini giriniz ve Enter'a basiniz");
        double cemberYariCap = scan.nextDouble();
        System.out.println("Cemberin Cevresi="+(2*Math.PI*cemberYariCap));

        System.out.println("Dairenin Alanı="+(Math.PI*cemberYariCap*cemberYariCap));

        // 4.Soru Dikdörtgenler Prizmasının Hacmini Bulma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Dikdörtgenler prizmasinin uzunkenar, kisa kenar ve yüksekliğini giriniz ve aralarda Enter'a basiniz");
        int uzunKenar = scan.nextInt();
        int kisaKenar = scan.nextInt();
        int uzunluk = scan.nextInt();
        System.out.println("Prizmanin Hacmi="+(uzunKenar*kisaKenar*uzunluk));
        // 5. Kullanicidan İsim Soyisim alip kursa katılımınız saglanmıstır teşekkür ederiz yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve Soyisminizi giriniz ve aralarda Enter'a basiniz");
        String isim= scan.next();
        String SoyIsim= scan.next();


        System.out.println("İsminiz:"+isim);
        System.out.println("Soyisminiz:"+isim);
        System.out.println("Kursa katiliminiz alinmistir. Tesekkurler");*/

        //6.Kullanicidan İsim Soyisim alip yan yana yazdirma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve Soyisminizi giriniz ve aralarda Enter'a basiniz");
        String isim= scan.next();
        String SoyIsim= scan.next();
        System.out.println("İsminiz - Soyisminiz:" +isim+" "+SoyIsim);



    }

}
