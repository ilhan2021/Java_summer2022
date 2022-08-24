package day01_48.day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayiTop=0;

        do{
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                pozSayiTop+=sayi;
                pozSayiAdedi++;
            } else if (sayi<0) {
                negSayiAdedi++;
                System.out.println("negatif sayi giremezsiniz");
            }

        }while (sayi!=0);
        System.out.println(pozSayiAdedi + " adet pozitif sayi giriniz, toplamlari : " + pozSayiTop);
        System.out.println(negSayiAdedi + " adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");
    }
}
