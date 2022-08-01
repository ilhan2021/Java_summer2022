package practice.practice_day11InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir string ifade giriniz");
        String str = scan.nextLine();
        System.out.println(str);
        String arr[]=str.split("");

        Arrays.sort(arr);
        System.out.println("(arr) = " + Arrays.toString(arr));

    }
}
