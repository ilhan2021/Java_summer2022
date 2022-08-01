package recap02;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, 
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyismini girin:");
        String firstname = scan.nextLine(), lastname=scan.nextLine();
        String fullName = firstname.concat(" "+ lastname).toUpperCase();
        System.out.println("fullName = " + fullName);
    }
}
