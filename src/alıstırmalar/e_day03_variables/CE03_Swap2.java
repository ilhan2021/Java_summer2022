package alıstırmalar.e_day03_variables;

public class CE03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu farklı bir yontem kullanarak cozunuz
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("swaptan önce  " + "sayi1: " + sayi1 +" "+ "sayi2: " + sayi2);
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swaptan sonra sayi1=" +sayi1 +" "+ "swaptan sonra sayı2=" +sayi2);

    }
}
