package day01_48.day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=0);//false

         /*
        java and operatorleri konusunda iki seçenek sunar

        && kullanırsak ilk false tan sonra sınuç false çıkacağı için diğerler şartları incelemez
        & kullanırsak tüm şartları kontrol eder sonra sonucu belirler

        bu nedenle & operatoru && operatorune göre yavaş çalışır
         */

        System.out.println(a<0 & b<20 & c>=0);//false


    }
}
