package day01_48.day12_stringManipulation;

public class C03_substring {
    public static void main(String[] args) {
        String isim = "Suleyman";
        String soyisim = "karanfil";
        String kartNo = "1234 5678 5678  6789";
        System.out.println(isim.substring(3));// eyman      ----> 3 karekterden itibaren yazdir
        System.out.println(soyisim.substring(soyisim.length()-3));//fil  ------> sondan 3 indextenitibaren yazdir

        System.out.println(isim.substring(2,4));// le --------> 2.indexten başla 4' kadar yazdir 4 hariç
        //isim ve soyismin ilk harfi buyuk harf geriye kalan *
        //kredi kartının ilk 4 rakamı açık diğerleri *
        String ilkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan = isim.substring(1).replaceAll("\\W","*");

        String soyisimİlkHarf = soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan = soyisim.substring(1).replaceAll("\\W","*");

        String kkIlk4 = kartNo.substring(0,4);
        String kkGeriyeKalan = " **** **** ****";

        System.out.println(ilkHarf+isimGeriyeKalan+" "+soyisimİlkHarf+soyisimGeriyeKalan+" "+"\n"+
                kkIlk4+kkGeriyeKalan);//Suleyman Karanfil
                                      //1234 **** **** ****

    }
}
