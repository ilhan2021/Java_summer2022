package day01_48.day16_for_loop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
  Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
  Ancak;
- Sayi 3’un kati ise sayi yerine "Java" yazdirin.
- Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.

   */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100den kucuk sayı giriniz");
        int sayi = scan.nextInt();
        for (int i = 0; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("JavaGuzeldir"+"\n ");
            } else if (i%5==0) {
                System.out.print("Güzeldir"+" ");
            } else if (i%3==0) {
                System.out.print("Java"+" ");
            }else{
                System.out.print(i+" ");
            }
        }


    }
}
