package day01_48.day14_methodCreation;

public class C04_MethodCreationReturn {
    // VErilen isim ve soyismi ilk harfi büyük
    // Geriye kalanları yıldız olacak şekilde değiştirip
    // bize bu halini donduren bir method oluşturun
    // Not: Programın ilerleyen kısmında isi ve soyismi bu şekilde kullanmak istiyoruz.

    public static void main(String[] args) {
        String isim = "Enes";
        String soyIsim = "Bozkurt";
        String gizliİsim = isimGizle(isim,soyIsim);
        System.out.println(gizliİsim);
        System.out.println(isim+" "+soyIsim);
    }

    public static String isimGizle(String isim, String soyIsim) {
        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyIsim= soyIsim.substring(0,1).toUpperCase()
                +soyIsim.substring(1).replaceAll("\\w","*");

               return isim+" "+soyIsim;
    }
}
