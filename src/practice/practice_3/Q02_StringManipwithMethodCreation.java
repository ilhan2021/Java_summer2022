package practice.practice_3;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz:");
        String str =scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));
    }

    public static boolean xyzVarmi(String str) {
        if(str.contains("xyz")){
            return true;
        }else {
            return false;
        }
    }

}
