package day01_30.day16_for_loop;

public class C01_ForLoop {

    // verilen pozitif tam sayının
    // tam bolenlerini yazdıralım

    public static void main(String[] args) {
        int input = 20;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}