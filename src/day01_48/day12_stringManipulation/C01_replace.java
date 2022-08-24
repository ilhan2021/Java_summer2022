package day01_48.day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {
        String str = "Bu gun ha va cok guz el";
        System.out.println(str.replace(" ", "")); //Bugunhavacokguzel

        // hava yerine java yazalım boşlukları kaldıralım
        System.out.println(str.replace("h","J").replace(" ", ""));//BugunJavacokguzel

        // guz el yerine harika yazalim
        System.out.println(str.replace("guz el", "harika"));//Bu gun ha va cok harika
        // cumleyi replace kullanarak bugün java cok guzel yapalim
        str = str.replace("Bu gun", "Bugun")
                .replace("ha va", "Java")
                .replace("guz el", "guzel")  ;
        System.out.println(str);//Bugun Java cok guzel
    }
}
