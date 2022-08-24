package day01_48.day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        // verilen 2 int'i toplayip sonucu yazdiralim
        int sayi1 =10;
        int sayi2 =20;
        int sayi3 =30;

        toplaYazdir(sayi1,sayi2,sayi3);

    }

    private static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("toplaYazdir"+(sayi1+sayi2+sayi3));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {
        System.out.println("2 sayinin tolami :"+(sayi1+sayi2));
    }
}
