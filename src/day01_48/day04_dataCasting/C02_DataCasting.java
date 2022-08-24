package day01_48.day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2= 5;
        System.out.println(sayi1/sayi2);// ikiside int olduğu için sonucu int yazdırır yani 4.6 yerine 4 yazardırır
        System.out.println(25*7/3);//58.6666---->58

        double sayi3 = 5;
        System.out.println(sayi1/sayi3);// iki variable'in data turu degisik oldugundan daha kapsamli olani
                                        // data turu kabul eder
    }
}
