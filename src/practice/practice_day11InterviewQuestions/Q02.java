package practice.practice_day11InterviewQuestions;

public class Q02 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
     *  alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        String input = "Elma";
        int sayi = 2;
        String[] arr = input.split("");

        inputDondur(arr,sayi);
    }

    public static void inputDondur(String[] arr, int sayi) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i < 1) {

                //System.out.print(sayi*(arr[i]));
            } else if (i< arr.length) {
                System.out.println(arr[arr.length-1]+arr[arr.length-1]);
                break;
            }

        }

    }
}


