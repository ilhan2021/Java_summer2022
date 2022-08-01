package day01_30.day14_methodCreation;

import day01_30.day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Verilen 3 basamaklı sayinin
        // rakamlari toplamini yazdiran bir method oluşturalim

       int input = 423;
       rakamlarıTopla(input);
        C04_MethodCreation.topla(45,5);
        C01_MethodCreation.terstenYazdir("nuri");
    }

    public static void rakamlarıTopla(int input) {
        int birlerBasamaği = 0;
        int rakamlarToplami = 0;
        int temp = input;

        birlerBasamaği = input%10;
        rakamlarToplami+=birlerBasamaği;
        input/=10;

        birlerBasamaği = input%10;
        rakamlarToplami+=birlerBasamaği;
        input/=10;

        birlerBasamaği = input%10;
        rakamlarToplami+=birlerBasamaği;
        input/=10;
        System.out.println("Girdiğiniz " +temp+ " sayisinin rakamlar toplami : "+rakamlarToplami);

    }
}
