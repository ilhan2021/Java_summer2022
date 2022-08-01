package day01_30.day24_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        //


        int[] arr ={2,3,5,6,3,5,4,1,9,6,3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> tekrarEdenler = new ArrayList<>();    // 2 den fazla tekrar edenleri fazla yazmaması için

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]==arr[i+1]&& !tekrarEdenler.contains(arr[i])){
                System.out.print(arr[i]+ " ");
                tekrarEdenler.add(arr[i]);
            }

        }
    }
}
