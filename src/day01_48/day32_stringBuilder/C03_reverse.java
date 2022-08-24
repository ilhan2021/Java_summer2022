package day01_48.day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir inputu tersine cevirip,
        // bize donduren bir methot olustrn

        String input = "Hey gidi for loop gunleri";
        String tersInput = tersineCevir(input);
    }
    public static String tersineCevir(String input){
        StringBuilder sb = new StringBuilder();
        return sb.reverse().toString();
    }

}
