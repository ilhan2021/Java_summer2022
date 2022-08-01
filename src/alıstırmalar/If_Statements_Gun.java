package alıstırmalar;

import java.util.Scanner;

public class If_Statements_Gun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        String ilkHarf = scan.nextLine().toLowerCase();
        if (ilkHarf.equals("p")) {
            System.out.println("Pazar,Pazartesi,Persembe");
        } else if (ilkHarf.equals("s")) {
            System.out.println("Salı");
        } else if (ilkHarf.equals("ç")) {
            System.out.println("çarsamba");
        } else if (ilkHarf.equals("c")) {
            System.out.println("cuma,cumartesi");
        } else {
            System.out.println("yanlıs giris");
        }

    }
}

