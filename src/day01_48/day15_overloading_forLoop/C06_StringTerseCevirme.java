package day01_48.day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        // input olarak verilen Stringi terse cevirip yazdiran bir method oluşturun
        String input = "Java gun gectikce guzelleşiyor";
        terstenYazdir(input);
        terstenYazdir2(input);
    }

    private static void terstenYazdir2(String input) {
        String tersInput2 = "";
        for (int i = input.length()-1; i >=0; i--) {
            tersInput2 +=input.substring(i,i+1);

        }
        System.out.println(tersInput2);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
        }
    }

