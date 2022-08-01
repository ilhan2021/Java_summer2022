package dev_requarment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavCozum {


 /* Basarili Market-manav al??-veri? program?.
        *
        * 1. Ad?m: Ürünler ve fiyatlar? içeren listeleri olu?turunuz.
        *        No       Ürün         Fiyat
                ====     =======      =========
                00      Domates        20.10 TL
                01      Patates        30.20 TL
                02      Biber          30.50 TL
                03      So?an          20.30 TL
                04      Havuç          30.10 TL
                05      Elma           50.20 TL
                06      Muz            100.90 TL
                07      Çilek          60.10 TL
                08      Kavun          40.30 TL
                09      Üzüm           20.70 TL
                10      Limon          10.50 TL
        * 2. Ad?m: Kullan?c?n?n ürün nosuna göre listeden ürün seçmesini
        * isteyiniz.
        * 3. Ad?m: Kaç kg sat?n almak istedi?ini ve urun kodunu  aliniz.
        * 4. Ad?m: Al?nacak bu ürünü sepete ekleyiniz
        * 5. Sepeti yazd?r?n?z.
        * 6. E?er devam etmek istiyorsa yeniden ürün seçme k?sm?na
        * yönlendiriniz.
        * 7. E?er bitirmek istiyorsa ödeme k?sm?na geçiniz ve
        * ödeme sonras?nda program? bitiriniz.
    */
 static List<String> urunler = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyat = new ArrayList<>();
    static int urunNo=0;
    static double urunMiktari = 0;
    static double toplamFiyat=0;


    public static void main(String[] args) {
        urunler.add("Domates");
        urunFiyatlari.add(20.10);
        urunler.add("Patates");
        urunFiyatlari.add(30.20);
        urunler.add("Biber");
        urunFiyatlari.add(30.50);
        urunler.add("Sogan");
        urunFiyatlari.add(20.30);
        urunler.add("Havuc");
        urunFiyatlari.add(30.10);
        urunler.add("Elma");
        urunFiyatlari.add(50.20);
        urunler.add("Muz");
        urunFiyatlari.add(100.90);
        urunler.add("Cilek");
        urunFiyatlari.add(60.10);
        urunler.add("Kavun");
        urunFiyatlari.add(40.30);
        urunler.add("Uzum");
        urunFiyatlari.add(20.70);
        urunler.add("Limon");
        urunFiyatlari.add(10.50);
        Scanner scan = new Scanner(System.in);
        System.out.println("Almak istediğiniz ürünü seçiniz");
        urunNo = scan.nextInt();
        System.out.println("lütfen almak istediğiniz miktari yaziniz");
        urunMiktari = scan.nextDouble();
        toplamFiyat += urunFiyatlari.get(urunNo-1)*urunMiktari;
                System.out.println( urunler.get(urunNo-1) + "\t\t " + urunFiyatlari.get(urunNo-1) + "\t\t"+toplamFiyat);

        urunleriListele();
        sepeteEkle(urunNo,urunMiktari);
    }

    private static void sepeteEkle(int urunNo, double urunMiktari) {
        sepetKg.add(urunMiktari);
        sepetFiyat.add(urunFiyatlari.get(urunNo-1)*urunMiktari);
        sepetUrunler.add(urunler.get(urunNo-1));
    }


    public static void urunleriListele() {
        System.out.println("========== Markete Hosgeldiniz=============");
        System.out.println("========== urunleriListele==========");
        for (int i = 0; i < urunler.size();i++){
            System.out.println((i + 1) + "\t\t " + urunler.get(i) + "\t\t " + urunFiyatlari.get(i) + " TL");
        }
    }
}
