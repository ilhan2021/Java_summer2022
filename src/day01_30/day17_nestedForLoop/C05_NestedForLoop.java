package day01_30.day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
    verilen input a göre yilidizlardan olusan bir input oluşturun
    örn : input 4 ise
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
     */

        // artan kısmı nested forloop ilr ypalım
        int input =4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1 ; j <=1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
