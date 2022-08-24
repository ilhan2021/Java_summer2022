package day01_48.day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
       /*
       1- Verilen sayi1 ve sayi2 variable lerinin değerlerini değiştiren (SWAP)
       bir program yazınız.
            orn      : sayi1=15 ve
                       sayi2=30;
            kod çalıştıktan sonra
            sayi1=20 ve
            sayi2=10

        */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        // sayı 3 bizim geçici sayımız

        // adım 1 sayi2 yi 3'e atayalım
        sayi3 = sayi2;

        // adım 2 sayi1 yi 2'e atayalım
        sayi2 = sayi1;

        // adım 3 sayi3 yi 1'e atayalım
        sayi1 = sayi3;

        System.out.println("swaptan sonra sayi1  :" + sayi1);//20
        System.out.println("swaptan sonra sayi2  :" + sayi2);//10
    }
}
