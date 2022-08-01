package day01_30.day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen en ve boy değerlerine göre *lardan,
        oluşan bir dik dörtgen oluşturalım
        yükseklik :3   boy:4
         */
        int yukseklik= 4;
        int boy =8;
        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
