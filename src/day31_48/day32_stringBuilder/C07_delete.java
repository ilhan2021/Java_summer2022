package day31_48.day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(8, 9);
        System.out.println("sb = " + sb);//Java herzaman guzel

        sb.deleteCharAt(8);
        System.out.println("sb = " + sb);//Java heraman guzel ---8. satira göre hareket eder

        int son = sb.length();

        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb); }


/*
        for (int i = 1; i < son; i++) {
            sb.deleteCharAt(son-i);
            System.out.println(sb); }
        }*/
    }
}