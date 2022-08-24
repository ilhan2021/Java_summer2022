package day01_48.day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        binarySearch method'u siralanmis array'de aradigimiz elementin index'ini dondurur
         Ya aradigimiz element array'de yoksa ?
         (String'de indexOf() bize olmayan elementler icin -1 donduruyordu)
        Aradigimiz element array'de yoksa Java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur
        olmadigini ifade icin - kullanir
        olsaydi nerede olacagini belirtmek icin index degil siralama kullanir

         */
        int[]sayilar = {3,7,15,4,27,9,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//5
        // olan elemanlarda sıkıntı olmaz ve hangi indexte olduğunu yazardı.
        // olamayan elmanlar için yok yazar ama olsaydı şurada olurdu diye yazar Ama sırasını yazar
        System.out.println(Arrays.binarySearch(sayilar,11));     //-6
        System.out.println(Arrays.binarySearch(sayilar,6));      //-3
        System.out.println(Arrays.binarySearch(sayilar,-100));    //-1
    }
}
