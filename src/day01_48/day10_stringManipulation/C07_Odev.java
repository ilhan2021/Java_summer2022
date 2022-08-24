package day01_48.day10_stringManipulation;

public class C07_Odev {
    public static void main(String[] args) {
      /*
      Kullanıcıdan bir cümle ve bir harf isteyin istenilen harf cümlede kackere
      kullanılmış bulun...
       */
        String str = "Java ogrenmek cok guzel";
        // bu cümledeki e harflerini bulalım
        int ilkEHarfi = str.indexOf("e");
        int ikinciEHarfi = str.indexOf("e",ilkEHarfi+1);
        if(ilkEHarfi==-1){
            System.out.println("Verilen cümle de e harfi yoktur");
        } else {
            int ucuncuEHarfi=str.indexOf("e",ikinciEHarfi+1);
            if(ucuncuEHarfi==-1){
                System.out.println("verilen stringde baska e harfi yoktur. ");
            }else {
                System.out.println("verilen str de ucuncue nin index i = " + ucuncuEHarfi);
            }


        }

    }
}
