package practice.practice_day04;

import java.util.Scanner;

public class Q02_MethodCreation {
     /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("metre ve km ye dönüştürmek istediğiniz cm değerini giriniz");
         double santiMetreValue = scan.nextDouble();
         convertSM(santiMetreValue);
     }

    public static void convertSM(double santiMetreValue) {
         double meter = santiMetreValue/100;
         double kmMeter = santiMetreValue/1000;
        System.out.println("Girdiğiniz santimetre değeri :"+santiMetreValue+": "+meter+"m ve "+kmMeter+"km'dir.");
    }


}
