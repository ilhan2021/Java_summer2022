package day01_30.day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi
         iceriyorsa tum cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa
         tum cumleyi kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa
          “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle = "Java buyuk, dunya kuculu";
        cumle = cumle.toLowerCase();
        // requirements'de buyuk harf kucuk harf hassasiyeti hakkında birşey denilmemiş
        // 2. olarak da iki kelimeyide içerme durumu açıklanmamış
        // budurumda biz görev veren esorulmalı
        // ek requements = ikisinide içeriyorsa "karar ver buyuk mü küçük mu yazdırayim
        // case sensitiv

        if  (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu kucuk mu yazdirayim");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if  (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("cumle kelmesi buyuk yada kucuk içermiyor");
        }

    }
}
