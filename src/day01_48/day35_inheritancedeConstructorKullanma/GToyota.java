package day01_48.day35_inheritancedeConstructorKullanma;

public class GToyota {
    GToyota(){

        System.out.println("GToyota Parametresiz const.");
    }
    GToyota (String isim){
        //super isim(); Extends olamdıgı icin kabul etmez

        System.out.println("GToyota Parametli  const.");
    }
}
