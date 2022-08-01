package alıstırmalar.e_day04_variables;

public class CE_01_DataCasting {
    public static void main(String[] args) {

        char harf ='a';
        char yeniHarf =(char) (harf+2);
        System.out.println(yeniHarf);
         /*
        Bazen bir variable'a oluşturulduğu data turu dısında değer atanabilir
        bunlardan bazısını java otomatik kabul eder
        java eğer bu deger atamasinda sorun oluşacağını
        (data kayıpların alabileceği veya datanın baskalasabilecegini) görürse
        otomatik atamayı kabul etmez
        onun için sizden bu atama sorumluluğunu sizden almanızı ister
         */

        int sayi1= (int) 7.3;
        System.out.println("sayi1 :"+sayi1); // 7
        double sayi2= 10;
        System.out.println("sayi2 :"+sayi2);//10.0
        int sayi3=(int) 'c';
        System.out.println("sayi3 :"+sayi3);    //99
        char harf2=(char)98;
        System.out.println("harf2 :"+harf2);    //b




    }
}
