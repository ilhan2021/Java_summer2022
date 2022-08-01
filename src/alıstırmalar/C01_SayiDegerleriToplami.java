package alıstırmalar;

public class C01_SayiDegerleriToplami {
    public static void main(String[] args) {
    /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
     */
        int sayi = 12345;
        int toplam = 0;
       while (sayi!= 0){
           toplam += sayi%10;
           sayi=sayi/10;

       }
        System.out.println(toplam);
    }
}
