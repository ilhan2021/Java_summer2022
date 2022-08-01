package practice.practice_1_2;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Y/N ikilisinden birini giriniz:");
        char karakter = scan.next().charAt(0);

        if(karakter == 'y'|| karakter=='Y'){
            System.out.println("YES");
        } else if (karakter=='n' || karakter=='N') {
            System.out.println("NO");
        } else{
            System.out.println("Lütfen Doğru Karakteri Giriniz");
        }
    }
}
