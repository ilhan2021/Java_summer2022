package day01_30.day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {
        C01       obj1     =   new           C01()     ;
  //class adi   obje adi     keyword      constructor(javanın obje olusturmak icin
                                                    // kullanigi kod blogudur.

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
     // List<String> list2 = new List<>();
        /*
        Java da obje oluşturmak için mutlaka constructor kullanmalisiniz.
         */

        System.out.println(obj1.sayi);//0 java defult değer atar
        obj1.deneme();// C01 de deneme methodu calisir
    }
}
