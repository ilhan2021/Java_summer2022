package practice.practice_day07;

public class Q04_Arrays {
    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str = str.replace(" ","");
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());



        String harf[]=str.split("");
        System.out.println("harf.length = " + harf.length);



        String str1 ="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[] kelime = str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);

        
        String[] caracter = str1.split("");
        System.out.println("caracter Sayisi = " + (caracter.length-boslukSayisi));
    }
}
