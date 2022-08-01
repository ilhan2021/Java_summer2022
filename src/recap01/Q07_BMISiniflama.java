package recap01;

import java.util.Scanner;

public class Q07_BMISiniflama {
    /*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz");
        double boy = scan.nextDouble()/100;  // boyu metreye çevirdik

        System.out.println("kilonuzu kg olarak giriniz:");
        double kilo = scan.nextDouble();

        double bmi = kilo/(boy*boy);

        if(bmi<=20){
            System.out.println("bmi indeksiniz:"+bmi+" oldukça zayıfsınız");
        } else if (bmi<=25) {
            System.out.println("bmi indeksiniz:"+bmi+" normal sınırlardasınız");
        } else if (bmi<=30) {
            System.out.println("bmi indeksiniz:"+bmi+" Şisman kategoridesiniz");
        } else if (bmi>30) {
            System.out.println("bmi indeksiniz:"+bmi+" Obez kategoridesiniz");
        }

    }
}
