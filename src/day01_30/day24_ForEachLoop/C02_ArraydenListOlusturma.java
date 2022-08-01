package day01_30.day24_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        !!!!!!!!!!!!!!!!!
         */

        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();
        while (sayiListesi.size()<200){

            sayi = rnd.nextInt(1000);

            if(!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.print(sayiListesi);

        boolean bildiMi = false;
        int tahminSayisi=1;
        Scanner scan = new Scanner(System.in);

        while(!bildiMi){//bildiMi==false
            System.out.println("Lütfen bir sayi tahminşde bulunun");
            sayi = scan.nextInt();

            if(sayiListesi.contains(sayi)){
                System.out.println("Tebrikler "+ tahminSayisi+ "adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi+" adet sayi soylediniz ama hicbiri listede yok");
                tahminSayisi++;
            }
        }

    }
}
