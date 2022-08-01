package day01_30.day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str ="banan";
        System.out.println(sayi+harf); //10a değil 107 çıktı sonuç
        System.out.println(str+harf); //banana
        /*
        1- char data turu  isleme girdiği değişkenin  turune göre farklı davranabilir
        eger matemetiksel  işleme girdiği variable sayısal bir değerse  sayi  gibi davranır
        onun için ASCII tablosunda kendisine denk gelen sayı gibi davranır

         */
        // peki 10a yazabilmek için
        System.out.println(""+sayi+harf);
    }
}
