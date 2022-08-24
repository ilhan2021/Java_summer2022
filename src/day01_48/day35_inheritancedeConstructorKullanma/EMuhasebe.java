package day01_48.day35_inheritancedeConstructorKullanma;

public class EMuhasebe extends DPersonel {
    EMuhasebe(){

        System.out.println("Muhasebe Parametresiz const.");
    }
    EMuhasebe (String isim){

        System.out.println("Muhasebe Parametli  const.");
    }
}
