package day01_30.day25_constructor;

public class C03 {
    /*
    proje olusturuken bazi classlar run etmk icin degil
    variable ve method olusturup,bunlari baska classlarda kullanmak
    icin olusturulur
     */
    /*
    default constructor, parametresizdir
    goremesekte bile ihtiyac olusturugunuzda calisir

    eger class icinde baska bir parametreli veya parametresiz const. olusturursak
    java default const.'i siler
     */
    C03(){
    }
    /*
     Olusturdugumuz parametresiz bu constructor
     Default constructor ile 1-1 aynidir.
     ama biz olusturdugumuz icin buna
     default constructor demeyiz
     parametresiz constructor deriz.
     */
    String  isim = "Etka";
    public void method01() {
        System.out.println("C03 method calisti");
    }
}
