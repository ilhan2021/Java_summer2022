package day01_48.day17_nestedForLoop;

public class C04_NestedForLoop {
    /*
    verilen input a göre yilidizlardan olusan bir input oluşturun
    örn : input 4 ise
    *
    * *
    * * *
    * * * *
     */

    public static void main(String[] args) {

        int input = 4;

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}
