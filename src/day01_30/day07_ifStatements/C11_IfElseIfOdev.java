package day01_30.day07_ifStatements;

import java.util.Scanner;

public class C11_IfElseIfOdev {
    /*
    kullanıcıdan 100 üzerinden not girmesini isteyin ve girilen notu harf sistemine cevirip yazdirin.
    50 den kucukse "D", 50-60 arası ise "C", 60-80 arası ise "B", 80-100 arası ise "A"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar olan bir not değeri giriniz");
        double not = scan.nextDouble();
        if (not>=0 && not<50){
            System.out.println("girilen not: D");
        } else if (not>=50 && not<60){
            System.out.println("girilen not: C");
        } else if (not>=60 && not<80){
            System.out.println("girilen not: B");
        } else if (not>=80 && not<=100){
            System.out.println("girilen not: A");
        } else{
            System.out.println("lutfen 0-100 arasinda bir not giriniz.");
        }
    }
}
