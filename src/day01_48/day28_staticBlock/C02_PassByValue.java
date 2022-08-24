package day01_48.day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati));//90

        //iki farkli method'da satisfiyati isminde variable olabilir.
        //Java buna itiraz etmez cunku, scope'lari farklidir.|

    }
    public static double indirimliFiyat(double orjinalFiyat){
        // method %10 idirim yapip
        //yeni fiyati main method'a döndürsün
        return orjinalFiyat*0.9;
    }
}
