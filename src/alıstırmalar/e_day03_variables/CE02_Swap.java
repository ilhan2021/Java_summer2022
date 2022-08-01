package alıstırmalar.e_day03_variables;

public class CE02_Swap {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi1;// sayi3=10  sayi1=10  sayi2=20
        sayi1 = sayi2;// sayi1=20  sayi2=20  sayi3=10
        sayi2 = sayi3;
        System.out.println("swaptan sonra sayı1="+sayi1);
        System.out.println("swaptan sonra sayı2="+sayi2);

    }
}
