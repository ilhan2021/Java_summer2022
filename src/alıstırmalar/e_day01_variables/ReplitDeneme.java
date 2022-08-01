package alıstırmalar.e_day01_variables;

import java.util.Arrays;

public class ReplitDeneme {
    public static void main(String argu[]) {

    /*yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]
     */
        int[] arr={1551,1223,1443,1267,1789,1023,2020};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int arananDeger = 2020;
        for (int i = 0; i < arr.length; i++) {

                 if(arr[i] == arananDeger){
                     System.out.println("**True**");
                     break;

                 }

        }if(arananDeger==-1){
            System.out.println("**False**");
        }


    }

}




