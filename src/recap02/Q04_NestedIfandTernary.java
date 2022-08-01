package recap02;

public class Q04_NestedIfandTernary{
    public static void main(String[] args) {
        int sayi=5;
        String sonuc="";
        if (sayi >= 0 && sayi <= 9) {
            if(sayi==9){sonuc="dokuz";}
            else if(sayi==8) {sonuc="sekiz";}
            else if(sayi==7) {sonuc="yedi";}
            else if(sayi==6) {sonuc="altı";}
            else if(sayi==5) {sonuc="bes";}
            else if(sayi==4) {sonuc="dort";}
            else if(sayi==3) {sonuc="üc";}
            else if(sayi==2) {sonuc="iki";}
            else if(sayi==1) {sonuc="bir";}
            else sonuc="sıfır";

        } else sonuc="gecersiz";
    }

}
