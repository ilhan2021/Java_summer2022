package day01_48.day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata baglamayin";
        System.out.println(str.toUpperCase());// BENİ PSIKOPATA BAGLAMAYİN --- Klavye tr old. için böyle yazdı

        System.out.println(str.toUpperCase(Locale.ENGLISH)); //BENI PSIKOPATA BAGLAMAYIN

        //turkce klavye olamayan bilgisayarlarda
        //System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
