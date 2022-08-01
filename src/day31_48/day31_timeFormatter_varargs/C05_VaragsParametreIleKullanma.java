package day31_48.day31_timeFormatter_varargs;


public class C05_VaragsParametreIleKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdirma(5,true,"Ali","Ayse","Ismail","Ahmet","Gokhani","true");
    }                         //(----varags öncesi-----)(-----------------burasi varagstır--------------------)


    public static void enUzunKelimeyiYazdirma(int kelimeSayisi,boolean dogruMu, String... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime = each;

            }

        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
