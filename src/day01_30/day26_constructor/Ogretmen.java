package day01_30.day26_constructor;

public class Ogretmen {

    String isim="isim belitilmedi";
    String soyIsim="Soyisim belitilmedi";
    String dogumTarihi="Tarih belitilmedi";
    String brans="Brans belitilmedi";
    String yanbrans="Yan Brans belitilmedi";

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanbrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanbrans = yanbrans;
    }

    public Ogretmen() {

    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim= " + isim +
                "\nsoyIsim= " + soyIsim +
                "\ndogumTarihi= " + dogumTarihi +
                "\nbrans= " + brans +
                "\nyanbrans= " + yanbrans +'}';

    }
}
