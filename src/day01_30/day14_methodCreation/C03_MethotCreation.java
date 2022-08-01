package day01_30.day14_methodCreation;

public class C03_MethotCreation {
    public static void main(String[] args) {
        // ınputi olarak verilen isim ve soyismi
        // ilk harfi buyuk geriye kalan harfler yıldız(*) olacak sekilde
        // I**** K***** seklinde yazdırcak methot olştrn

        String isim="Enes";
        String soyIsim="Bozkurt";
        System.out.println("isim ve soyIsim = "+isim +" "+ soyIsim);//isim ve soyIsim = Enes Bozkurt
        ismiGizle(isim,soyIsim);
        System.out.println(isim+" "+soyIsim);// E*** B******
    }

    public static void ismiGizle(String isim, String soyIsim) {
        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyIsim= soyIsim.substring(0,1).toUpperCase()
                +soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyIsim);
    }
}
