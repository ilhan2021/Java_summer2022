package day01_30.day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 = " + ogretmen1);

        Ogretmen ogretmen2= new Ogretmen("Emre","Akdogan","1/1/2001","Matematik", "Fizik");
        System.out.println("ogretmen2 = " + ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","Cavidan","1/1/1990");
    }
}
