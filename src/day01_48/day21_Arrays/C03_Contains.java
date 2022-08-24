package day01_48.day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
   /* Soru 3- Kullanıcıdan aldığımız bir ismin Verilen
   array’denolup olmadığını kontrol edip, bize true veya false sonucu
    donen bir method olusturun.*/
   public static void main(String[] args) {
       String [] isimler ={"Basak","Nurullah","Fatih","Adem","Enes"};
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen aradiğiniz ismi giriniz:");
       String arananIsım= scan.nextLine();

       boolean sonuc = contains(isimler,arananIsım);
    if (sonuc){
        System.out.println("Girilen isim listede var");
    }else {
        System.out.println("Girilen isim listede yok");
    }
   }

    public static boolean contains(String[] isimler, String arananIsım) {
       boolean sonucMethod=false;
        for (int i = 0; i < isimler.length; i++) {

            if(isimler[i].equalsIgnoreCase(arananIsım)){
                sonucMethod=true;
            }

        }

       return sonucMethod;

    }
}
