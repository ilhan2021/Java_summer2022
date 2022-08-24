package day01_48.day32_stringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");

        System.out.println("(sb.indexOf(Pay)) = " + (sb.indexOf("Pay")));//0
        System.out.println("sb = " + sb);//Pay attention please

        System.out.println("(sb.indexOf(e)) = " + (sb.indexOf("e")));   //7
        System.out.println("(sb.indexOf(e)) = " + (sb.indexOf("e",10)));//16

        System.out.println("(sb.lastIndexOf(e)) = " + (sb.lastIndexOf("e"))); //19
        System.out.println("(sb.lastIndexOf(e)) = " + (sb.lastIndexOf("e",10)));//7




    }
}
