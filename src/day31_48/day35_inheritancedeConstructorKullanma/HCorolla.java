package day31_48.day35_inheritancedeConstructorKullanma;

public class HCorolla extends GToyota {
    HCorolla(){

        System.out.println("HCorolla Parametresiz const.");
    }
    HCorolla (String isim){
        super(isim);

        System.out.println("HCorolla Parametli  const.");
    }
}
