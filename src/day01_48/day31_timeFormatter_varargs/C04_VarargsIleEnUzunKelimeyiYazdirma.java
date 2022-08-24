package day01_48.day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdirma("Ali","Ayse","Ismail","Ahmet","Gokhani");
    }

    public static void enUzunKelimeyiYazdirma(String... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime = each;

            }

        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
