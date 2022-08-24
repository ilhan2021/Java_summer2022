package day01_48.day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu farklı bir yontem kullanarak cozunuz
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("swaptan önce  " + "sayi1: " + sayi1 +" "+ "sayi1: " + sayi2);
        sayi1 = sayi1 + sayi2;//10+20=30
        sayi2 = sayi1 - sayi2;//30-20=10
        sayi1 = sayi1 - sayi2;//30-10=20
        System.out.println("swaptan sonra " + "sayi1: "+ sayi1 + " "  + "sayi2: " + sayi2);
    }
}
