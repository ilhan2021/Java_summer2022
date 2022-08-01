package day31_48.day35_inheritancedeConstructorKullanma;

public class BParent extends AGrandParent {
    protected String isim = "Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    BParent(){
        System.out.println("Bparent constructor  calisti");
    }
}
