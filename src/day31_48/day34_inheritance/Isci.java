package day31_48.day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya
    karar verebilir Java da ise child classlar özelliklerini
    inherit etmek istedikleri class'i kendilerine parent edinirler.

    mesela isci class'ini olusturunca nelere intiyaci var
    diye dusunsek Personel class' indaki tum variable ve method'lara intiyaci
    oldugunu gorebiliriz.

    BU durumda yeniden o variable ve method lari olusturmak
    yerine Personel class' ini kendimize parent ediniriz

    bir class ı parent edinmek için extends keybord kullanmaliyiz

    bir class baska bir class'i parent edindiginde
    1- Child Classlar parent classlar daki tüm özelliklere sahiptir
    2- Child Classlar parent classlardaki bazı özellikleri
     kendine uyarlayabilir
    3- Child classlar parent classlarda olmayan bazı extra
    özelliklere sahip olabilir.

    not:parent classtaki özellikleri reddemez ama değiştirebilir

     */
    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim);//Isim belirtilmedi--> kendi claasımızda olmadigi için
                                        //parenttan alır
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 -->kendi claas ımızda varsa onu kullanılır

        isci1.maas();//Tum personelin maasi vardir
    }

    public void maas(){
        System.out.println("Isciler min 15€ saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Isciler min 15€ saat ucreti alir");
    }
}
