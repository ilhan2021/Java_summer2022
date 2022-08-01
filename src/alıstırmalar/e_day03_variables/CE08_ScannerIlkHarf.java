package alıstırmalar.e_day03_variables;

import java.util.Scanner;

public class CE08_ScannerIlkHarf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("isminizi ilk harfi: "+ ilkHarf);

    }
}
