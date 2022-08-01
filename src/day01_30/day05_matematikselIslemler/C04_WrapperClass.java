package day01_30.day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="java cok guzel";
        str.toUpperCase();
        int sayi=10;
        // primitive data turlerinin yaninda method'lar olmaz
        // java bazi method'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturmustur.
        Integer sayi2=10;
        System.out.println("sayi2.byteValue() = " + sayi2.byteValue());

    }
}
