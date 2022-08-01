package day31_48.day35_inheritancedeConstructorKullanma;

public class AGrandParent {
    protected String isim = "Grandpa ismi belirtilmedi";
    /*    Her class'da gorunmese bile bir constructor vardir
          Bu class'dan obje olusturmak istedigimizde
          default constructor devreye girecektir.
          Default constructor'i gozlemleyemeyecegimiz icin
          onun yerine kullanilabilecek parametresiz constructor olusturalim
         */
    protected String grandpaKlupAdi = "Grandpa KlupAdi";

    AGrandParent(){
        System.out.println("Grandpa constructor  calisti");
    }

}
