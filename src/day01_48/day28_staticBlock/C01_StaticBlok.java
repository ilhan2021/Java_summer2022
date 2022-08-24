package day01_48.day28_staticBlock;

public class C01_StaticBlok {
    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method ' dan bile once)

        static block class olusturuldugunda calisir
        genellikle de class'la ilgili on ayarlamalar
        veya static variable lara deger atamak icin kullanilir.

        static block'larin class icerisinde nerede oldugu onemli degildir
        once static block' lar calisir

        birden fazla static block varsa, yukaridan asagi dogru calisir
        */
        System.out.println("Static Blok Calisti.");
        sayi=10;
        }

    public static void main(String[] args) {
        System.out.println("Main method calisti.");
        System.out.println("sayi = " + sayi);
    }
    static {
        System.out.println("Main methodun altindaki static blok calisti.");
    }
}
