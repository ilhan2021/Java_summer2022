package day01_48.day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseIfOdev {
    public static void main(String[] args) {
        /*
         Kullanicidan gün isimlerinin ilk harfini ve o harfle başlayan günleri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Herhangi bir Günün Baş harfini Giriniz:");
        String ilkHarf = scan.next().toUpperCase();

        if (ilkHarf.equals("M")){
            System.out.println("Output = " + "MONDAY");

        } else if (ilkHarf.equals("T")) {
            System.out.println("Output = " + "TUESDAY"+" veya"+" THURSDAY");
        } else if (ilkHarf.equals("W")) {
            System.out.println("Output = " + "WEDNESDAY");
        } else if (ilkHarf.equals("F")) {
            System.out.println("Output = " + "FRIDAY" );
        } else if (ilkHarf.equals("S")) {
            System.out.println("Output = " + "SATURDAY"+" veya"+" SUNDAY" );
        } else  {
            System.out.println("Lütfen Doğru Giriş Yapdığınızdan Emin Olunuz!!!" );
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin Kenar Uzunluklarini Giriniz:");
        int aKenari = scan.nextInt();
        System.out.println("aKenari = " + aKenari);
        int bKenari = scan.nextInt();
        System.out.println("bKenari = " + bKenari);
        if (aKenari == bKenari){
            System.out.println("Bu Dikdörtgen Karedir.");
        } else {
            System.out.println("Bu Dikdörtgen Kare Değildir");
        }
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Gün Ismi Giriniz:");
        String gunIsmi = scan.next().toLowerCase();
        if(gunIsmi.equals("pazartesi")){
            System.out.println("gunIsmi= " + gunIsmi+ " / " +" (pazartesi giydim fesi:) )");
        } else if (gunIsmi.equals("sali")) {
            System.out.println("gunIsmi= " + gunIsmi+ ", " + " (sali sallanir:) ) ");

        } else if (gunIsmi.equals("carsamba")) {
            System.out.println("gunIsmi = " + gunIsmi + ", " + " (carsamba carsafa dolanır:) ) ");
        } else if (gunIsmi.equals("persembe")) {
            System.out.println("gunIsmi = " + gunIsmi + ", " + " (persembe padisahlik:) ) ");
        } else if (gunIsmi.equals("cuma")) {
            System.out.println("gunIsmi = " + gunIsmi + ", " + " (Muslumanlar icin mubarek gun) ");
        } else if (gunIsmi.equals("cumartesi")) {
            System.out.println("gunIsmi = " + gunIsmi + ", " + " (Yahudiler icin kutsal gun) ");
        } else if (gunIsmi.equals("pazar")) {
            System.out.println("gunIsmi = " + gunIsmi + ", " + "( Hristiyanlar icin kutsal gun) ");
        } else{
            System.out.println("Lütfen Dogru Giriş Yaptiginizdan Emin Olunuz");
            System.out.println("404 Not Found!!!");
        }
    }
}
