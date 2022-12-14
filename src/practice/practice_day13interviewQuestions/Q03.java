package practice.practice_day13interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("int bir sayi giriniz :");
        int sayi = scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);

        int i= 1;// while sartini kullanmak için kullandik
        if(sayi<=1){
            System.out.println("daha buyuk sayi gir");
        }else{
            while(fibonacciList.get(i)<sayi){//fibonacciList teki sayılar sayidan kucuk oldugu sürece devam etsin
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));
                i++;
            }
            System.out.println("fibonacciList = " + fibonacciList);
        }
        int sonIndextekiEleman=fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman)>sayi){
            fibonacciList.remove(sonIndextekiEleman);//sonIndextekiEleman i kaldirir
            System.out.println("girdiğiniz sayi fibonacci dizisinde yoktur. = " +
                    "sizin girdiğniz sayiya kadar olan fibonacci dizisi budur."+ fibonacciList);
        }else{
            System.out.println("senin girdiğin sayi fibonacci dizisinde var :"+ fibonacciList);
        }

    }
}
