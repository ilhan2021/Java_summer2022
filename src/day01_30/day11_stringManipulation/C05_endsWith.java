package day01_30.day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {
        String str = "ah be Java";
        System.out.println(str.endsWith("ava"));//true
        System.out.println(str.endsWith("Java"));//true
        System.out.println(str.endsWith("ah be Java"));//true
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith("ah"));//false ---çünkü bitişe bakar
    }
}
