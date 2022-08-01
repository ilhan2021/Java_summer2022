package practice.practice_day06;

import java.util.Scanner;

public class Q11_Odev {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        String pin = "ilhan.1978";
        int girisHakki = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********HosGeldiniz**********");
        while (true){
            System.out.println("pin kodunuzu giriniz : ");
            String girilenPin = scanner.nextLine();

            if(pin.equals(girilenPin)){
                System.out.println("Basarili Giris....");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz..");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : "+ girisHakki);
            } if(girisHakki==0){
                System.out.println("Giris Hakkiniz Kalmadi ... bloklandiniz..");
                break;
            }
        }
    }
    }
