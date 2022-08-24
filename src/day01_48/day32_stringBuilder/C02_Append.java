package day01_48.day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println("sb = " + sb);  //sb = Java daha ne yapsin?

        // append istedigimiz stringi en sona ekler


        sb.insert(4, "herseyi dusunmus daha ne yapsin");//
        System.out.println(sb); // Java herseyi dusunmus daha ne yapsın?

        // araya ekleme yapmak istedigimizde append degil insert kullanmalıyız

        sb.insert(25,"valla valla",5,11);
        System.out.println(sb);
    }
}
