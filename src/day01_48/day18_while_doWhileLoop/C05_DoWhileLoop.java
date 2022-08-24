package day01_48.day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        soru1)9dan 190 a kadar 7nin katı olan tüm sayiları ekrana yazdirin
         */
        int bas =9;
        int bitis=190;
        int temp=bas;
        while(temp<bitis){
            if (temp%7==0){
                System.out.println(temp+" ");
            }
            temp++;
        }
        // do while loop ile yapalim
        System.out.println("");
        temp=bas;
        do{
            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }while(temp<bitis);
    }
}

