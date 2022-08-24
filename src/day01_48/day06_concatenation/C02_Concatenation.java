package day01_48.day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "guzeldir";
        int sayi1=5;
        int sayi2=4;
        // yukarıdakileri kullanarak istenen metileri yazdiralim
        // Java guzeldir 54
        System.out.println(str1+" "+str2+" "+sayi1+sayi2);      //Java guzeldir 54
        System.out.println(str1+" "+str2+" "+ (sayi1+sayi2));   // Java guzeldir 9
        System.out.println(sayi1+sayi2+" "+ str1);              // 9 Java
        System.out.println(""+sayi1+sayi2+" "+str2);            // 54 guzeldir

        System.out.println(str1.concat(str2));                  //Javaguzeldir
        System.out.println(str1.concat(" ").concat(str2));  //Java guzeldir

    }
}
