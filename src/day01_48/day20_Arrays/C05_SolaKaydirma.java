package day01_48.day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        //Soru 1: Verilen 3 elemanli bir array’in
        // tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
       // Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int myArray[]={1,2,3,4,5,6};

        int temp = myArray[0];

        for (int i = 0; i < myArray.length-1 ; i++) {
            myArray[i]=myArray[i+1];

        }
        myArray[myArray.length-1]=temp;
        System.out.println(Arrays.toString(myArray));

       temp = myArray[myArray.length-1];

        for (int i = myArray.length-1; i >0 ; i--) {
            myArray[i]=myArray[i-1];

        }
        myArray[0]=temp;
        System.out.println(Arrays.toString(myArray));
    }
}
