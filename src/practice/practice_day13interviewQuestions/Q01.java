package practice.practice_day13interviewQuestions;

import java.util.Scanner;

public class Q01 {
    /*
     soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        method create ediniz
        parametre sayı alalim
        sayıların kupleri toplami conteiner atamasi
        girilen contenier
        if içind ekontrol ediniz
        % kullan
        basamaktaki bos sayi variable


      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        amstrong(sayi);


    }

    private static void amstrong(int sayi) {
        int kuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi;
        while (sayi>0){
            basamaktakiSayi=sayi%10;  // rakam rakam ayirdik sayiyi
            kuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi= sayi/10;
        }
        if(girilenSayi==kuplerToplami){
            System.out.println("Girilen sayi amstrong sayidir :"+girilenSayi);
        }else{
            System.out.println("Girilen sayi amstrong değildir :"+girilenSayi);
        }
    }


}
