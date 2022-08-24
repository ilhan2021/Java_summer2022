package day01_48.day10_stringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));// bana integer donduruyor
                                             // int'de yok diye bir deger bulunmuyor
                                             // 0 dersek J'nin index'idir
                                             // - 1 deger donerse biz aranan string'in str'da olmadigini anlariz
                                             // Java -1 dondurmeyi tercih etmistir

        String str5 = "aldhjaHCŞYşocjhKAJCLKajclcKşSJDFİSOJVŞLA";
        // str5 te "b" harfi kullanılmış mı
        if (str5.indexOf("b") == -1){
            System.out.println("str5 de istenen karakter kullanılmamış");

        }else{
            System.out.println("str5 de istenen karakter kullanılmış");
        }



    }
}
