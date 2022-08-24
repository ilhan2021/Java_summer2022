package day01_48.day25_constructor;

public class C01 {
    /*
      Java OOP konsept kullandigi icin
      olusturulan her bir class'in ihtiyac oldugunda obje uretebilmesine uygun dizayn etmistir
      Ama her class'dan obje uretilmeyebilir
      bunun icin Java ihtiyac halinde kullanilmasi icin
      her class'da default bir costructor koymustur.
      bu default constructor
      class'dan obje olusturuldugunda otomatik olarak calisir
      ornegin bu class'da constructor gorunmemesine ragmen
      C02 class'inda icinde oldugumuz C01 class'indan bir obje uretebildik
     /*

    1- Obje olusturmak icin constructor kullanmak zorundayiz
    2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
    3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
     */
    int sayi;


    public void deneme() {
        System.out.println("C01 den deneme methodu calisir");
    }
}