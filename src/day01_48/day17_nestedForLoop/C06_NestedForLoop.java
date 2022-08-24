package day01_48.day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen stringi asağıdaki gibi yazdiran program yazalım
        input = Deniz
        D
        D e
        D e n
        D e n i
        D e n i z
         */
        String input ="Deniz";
        for (int i = 0; 1 <=input.length(); i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");

        }
    }
}
