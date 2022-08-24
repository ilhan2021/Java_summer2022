package day01_48.day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
   // Soru 1- Verilen bir int array’deki
    // en buyuk sayiyi yazdiran
    // bir method olusturun.
   public static void main(String[] args) {
       int[] sayilar={3,5,7,9,1,4,15,5,2};
       maxSayiyiYazdir(sayilar);
   }

    public static void maxSayiyiYazdir(int[] sayilar) {
       int maxSayi=sayilar[0];                        // 0. elemanı ilk max sayı yaptık ondan sonraki ile karşılaştıracağız
        for (int i = 1; i <sayilar.length ; i++) {   // 0. elemanı max yazdığımız için i yi 1 den başlattık
           if (sayilar[i]>maxSayi){
               maxSayi=sayilar[i];
               System.out.println(" if in içinde maxSayi = " + maxSayi);
           }
        }


        System.out.println("maxSayi = " + maxSayi);
    }
}
