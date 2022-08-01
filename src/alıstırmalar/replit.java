package alıstırmalar;

import java.util.Arrays;

public class replit {
    /*
    Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

     */
    public static void main(String[] args) {
        String input ="ade1r4d35";
        String str="";
        str=input.replaceAll("\\D","");
        System.out.println(str);
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            toplam= toplam+Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(toplam);



    }
}
