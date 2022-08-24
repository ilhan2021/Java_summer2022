package day01_48.day04_dataCasting;

public class Odev {
    public static void main(String[] args) {
        // byte veri tipinde bir değişken oluşturun, short,int, float ve double data tiplerinde
        //    birer değişken oluşturup adim adim widening yapın ve yazdirin
        byte no1 = 55;
        short no2 = no1;
        int no3 = no2;
        long no4 = no3;
        float no5 = no4;
        double no6 = no5;
        System.out.println("No1=" + no1 + ", " + "No2=" + no2 + ", " + "No3=" + no3 + ", " + "No4=" + no4 + ", "
                + "No5=" + no5 + ", " + "No6=" + no6);
        //2- int veri turunde bir degisken olusturup adim adim narrowing yapin ve yazdirin
        int num1 = 22;
        short num2 = (short) num1;
        byte num3 = (byte) num1;
        long num4 = (long) num1;
        float num5 = (float) num1;
        double num6 = (double) num1;
        System.out.println("Num1=" + num1 + ", " + "Num2=" + num2 + ", " + "Num3=" + num3 + ", " + "Num4=" + num4 +
                ", " + "Num5=" + num5 + ", " + "Num6=" + num6);
        //3- float data turunde variable olusturun ve yazdirin

        float sy = 5.99f;
        System.out.println(sy);

        //4- double 255.36 int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin

        double sayi = 255.36;
        int sayi1 = (int) sayi;
        byte sayi2 = (byte) sayi1;
        System.out.println("sayı=" + sayi + ", " + "sayı1=" + sayi1 + ", " + "sayi2=" + sayi2 );

        //5- int 2 sayiyi birbirine böldürün ve sonucu yazdirin

        int nm1 = 40;
        int nm2 = 3;
        System.out.println("sonuc1= " +(nm1/nm2));

        //6- int bir sayiyi double bir sayiya bölün ve sonucu yazdirin

        int nmb1 = 25;
        double nmb2 = 5.2;
        System.out.println("sonuc2= " +(nmb1/nmb2));

       int nMM=3;
       nMM=+1;
        System.out.println(nMM);

    }
}