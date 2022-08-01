package day01_30.day13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.

        String str ="  Java ogrenmek123 Cok guzel@  ";
        str=str.trim();                                         //Java ogrenmek123 Cok guzel@ --  bastaki boşluklar gitti
        System.out.println(str);
        str =str.replaceAll("\\d"," ");         //Java ogrenmek Cok guzel@    --  rakamlar gitti
        System.out.println(str);
        str = str.replace("@","");              // Java ogrenmek Cok guzel    -- @ işareti silindi
        System.out.println(str);
        str = str.replace("C","c");             // Java ogrenmek cok guzel    -- c kck harf oldu
        System.out.println(str);
        str = str+".";                                          // Java ogrenmek cok guzel.    -- sona nokta koyduk
        System.out.println(str);
    }
}
