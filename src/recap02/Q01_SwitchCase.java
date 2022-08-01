package recap02;

import java.util.Locale;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)*/

    public static void main(String[] args) {
        String day = "sali".toLowerCase(Locale.ROOT);


        switch (day) {
            case "pazatesi":
            case "sali":
                System.out.println("Java DERSLERİ");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("sQL Dersleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum Dersleri");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
