package day01_48.day03_scanner;

import java.util.Scanner;

public class C09_PinarOrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik ortalamasını Giriniz ve Enter a Basınız");//92,3334
        double matOrt= scan.nextDouble();

        System.out.println("Türkçe ortalamasını Giriniz ve Enter a Basınız");//97,1667
        double turkOrt= scan.nextDouble();

        System.out.println("Sosyal ortalamasını Giriniz ve Enter a Basınız");//96,1667
        double sosOrt= scan.nextDouble();

        System.out.println("Fen Bilgisi ortalamasını Giriniz ve Enter a Basınız");//95,3334
        double fenOrt= scan.nextDouble();

        System.out.println("Din Kültürü ortalamasını Giriniz ve Enter a Basınız");//99,3334
        double dinOrt= scan.nextDouble();

        System.out.println("Seçmeli Drama ortalamasını Giriniz ve Enter a Basınız");//100
        double drmOrt= scan.nextDouble();

        System.out.println("Seçmeli Okuma Becerileri ortalamasını Giriniz ve Enter a Basınız");//97,8334
        double okBecOrt= scan.nextDouble();

        System.out.println("Müzik ortalamasını Giriniz ve Enter a Basınız");//100
        double muzOrt= scan.nextDouble();

        System.out.println("Görsel Sanatlar ortalamasını Giriniz ve Enter a Basınız");//100
        double gorOrt= scan.nextDouble();

        System.out.println("Seçmeli Yabancı Dil ortalamasını Giriniz ve Enter a Basınız");//95,5
        double secYabOrt= scan.nextDouble();

        System.out.println("Yabancı Dil ortalamasını Giriniz ve Enter a Basınız");//95
        double yabOrt= scan.nextDouble();

        System.out.println("Beden Eğitimi ortalamasını Giriniz ve Enter a Basınız");//100
        double bedOrt= scan.nextDouble();

        System.out.println("Bilişim Teknolojileri ortalamasını ve Giriniz ve Enter a Basınız");//96,6667
        double bilOrt= scan.nextDouble();


        double ortalama=((matOrt*5)+(turkOrt*6)+(sosOrt*3)+(fenOrt*4)+(dinOrt*2)+
                (drmOrt*2)+(okBecOrt*2)+(muzOrt*1)+(gorOrt*1)+(secYabOrt*2)+
                (yabOrt*3)+ (bedOrt*2)+(bilOrt*2))/(5+6+3+4+2+2+2+1+1+3+2+2+2);
        System.out.println("Yıl Sonu Ortalamanız:"+ortalama);

    }
}
