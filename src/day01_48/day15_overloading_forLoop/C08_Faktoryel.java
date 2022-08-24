package day01_48.day15_overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayi icin faktoryel hesaplayip yazdiran
           bir method olusturun
           verilen sayi negatif veya 20'den buyuk olursa
           "girilen sayinin faktoryeli hesaplanamaz"
           uyarisi yazdirin
         */
        int input=5;
        int input2=6;
        faktoryelHesaplama(input);
        faktoryelHesaplama2(input2);
    }

    private static void faktoryelHesaplama2(int input2) {
        int faktoriyel2 =1;
        if (input2<0 || input2>20){
            System.out.println("verilen sayiicin faktoryel hesaplanamaz");
        } else if (input2 == 0) {
            System.out.println("0!: 1'dir.");
        }else{
            for (int i = 1; i <=input2; i++) {
                faktoriyel2 *=i;
            }
            System.out.println("faktoriyel2 = " + faktoriyel2);
        }
    }

    public static void faktoryelHesaplama(int input) {
        int faktoryel = 1;

        if(input<0 || input>20){
            System.out.println("Verilen sayi için faktoryel hesaplanamaz");
        } else if (input==0) {
            System.out.println("0!: 1'dir");
        } else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.println("faktoryel degeri : " + faktoryel);
        }
    }
}
