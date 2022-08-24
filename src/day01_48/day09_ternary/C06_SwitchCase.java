package day01_48.day09_ternary;



public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanicidan  gun ismini alın
        hafta içi mi veya hafta sonu mu yazdirin

         */

        String input = "pazar";
        switch (input){
            case"pazartesi":
                System.out.println("hafta içi");
                break;
            case"sali":
                System.out.println("hafta içi");
                break;
            case"carsamba":
                System.out.println("hafta içi");
                break;
            case"persembe":
                System.out.println("hafta içi");
                break;
            case"cuma":
                System.out.println("hafta içi");
                break;
            case"cumartesi":
                System.out.println("hafta sonu");
                break;
            case"pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("geçerli gun giriniz");
        }
        switch (input){
            case"pazartesi":
            case"sali":
            case"carsamba":
            case"persembe":
            case"cuma":
                System.out.println("hafta içi");
                break;
            case"cumartesi":
            case"pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("geçerli gun giriniz");
        }
    }
}



