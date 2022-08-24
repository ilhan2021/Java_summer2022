package day01_48.day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {
        String str = "Java ogren; isi kap";
        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));// son karekter----p

        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakter-----k

        /*
        java'da null pointer (işaretliyici) bir deger değil,
        karsına yazıldıgı variablenin hiçbir değer almadığının işaretçisidir.
         */
        String str2 = ""; //str2 ye bir değer atanmıştır bu değer hiçliktir
        System.out.println(str2.length());// 0


        String str3 = null; // str3'e bir değer atanmamıştır null bunu işaret etmektedir.
        System.out.println(str3.length());//NullPointerException hatası verir.
    }
}
