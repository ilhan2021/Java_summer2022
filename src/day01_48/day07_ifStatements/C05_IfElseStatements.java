package day01_48.day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir karaekter girmesini isteyin
        ve girilen karakterin harf olup olamdıgini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char harf = scan.next().charAt(0);
        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karakter bir harftir");
        } else{
            System.out.println("Girilen karakter harf değildir");
        }
    }
}
