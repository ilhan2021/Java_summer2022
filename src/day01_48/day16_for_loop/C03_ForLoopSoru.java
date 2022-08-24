package day01_48.day16_for_loop;

public class C03_ForLoopSoru {
    public static void main(String[] args) {
        // Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        //  virgul olarak ayni satira yaziniz
        // son satira virgül koyma

        int ilk = 10;
        int son = 30;
        for (int i = ilk; i <= son; i++) {
            if (i < son) {
                System.out.println(i + ", ");
            } else {
                System.out.println(i);
            }

        }
    }
}
