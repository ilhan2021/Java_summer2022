package day01_48.day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 1'den 5e kadar (5 dahil) olan tamsayiları toplayın
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }
        System.out.println("toplam:" + toplam);
        // 10 dahil - 20 dahil ardaki sayiları topla
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;

        }
        System.out.println("10 ile 20 arası sayilar toplamı:" + toplam);

        // 30 dahil- 50 dahil arasındaki cift sayilar toplami
        toplam = 0;
        for (int i = 30; i <= 50; i += 2) {
            toplam += i;

        }
        System.out.println("30 ile 50 arası cift sayilar toplamı:" + toplam);
        //2. yontem
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30-50 arasi cift sayilarin toplam : " + toplam);
        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin
        toplam = 0;
        for (int i = 1500; i <= 1600; i++) {
            if (i % 7 == 0) {
                toplam += i;
            }
            System.out.println("1500-1600 arasi yedi ile " + "bolunebilen sayilarin toplam : " + toplam);
        }
    }

}

