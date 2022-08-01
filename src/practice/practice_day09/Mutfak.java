package practice.practice_day09;

public class Mutfak {
    public String yemekler ="adanakebap,urfaciger,kusbasi,kusleme";
    public String arasicak ="yaylacorba,mercimek,duguncorba,ezogelin";
    public String tatlilar ="baklava,sutlac,gullac,kazandibi,kunefe";
    public String icecekler ="ayran,salgam,kola";

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
    this.yemekler=adanakebap;
    this.arasicak=mercimek;
    this.tatlilar=kunefe;
    this.icecekler=salgam;
    }

    public Mutfak() {

    }

    @Override
    public String toString() {
        return
                "\nyemekler='" + yemekler + '\'' +
                ", \narasicak='" + arasicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler ;
    }
}
