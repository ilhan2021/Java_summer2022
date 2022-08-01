package practice.practice_day08;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
       int [] arr = {2,5,-9,45,43,11,8,102,102,47,0};
       int n =4;
       // Bir Liste Oluşturalım
        List<Integer> list = new ArrayList<>();

        // Listeye elemanlari ekleyelim
        for (int each:arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();

        int count=1;
        while (count<=n){
            int max = list.get(0); // list in ilk elemanı maximum olsun

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)>max && !(maxList.contains(list.get(i)))){   // listenin herhangi bi elemani max tan buyukse
                    max = list.get(i); // artik o max o eleman olsun
                }
            }
            maxList.add(max);
            count++;
        }
        System.out.println("array'in max "+n+ " elemani "+maxList);
    }
}
