package practice.practice_1_2;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int yas = 33;
        double boy = 1.78;
        System.out.println("yas :" + yas);
        System.out.println("boy = " + boy);
        // To copy the variable's value
        int yasım = 44;
        int enesYas = yasım;
        System.out.println("enesYas = " + enesYas);
        System.out.println("yasım = " + yasım);

        // you can declare multiple variables in the same line
        int yil = 2022, ay = 06, gun = 20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);
        // updating a variable
        yil = 2027;
        System.out.println("Update yil = " + yil);


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin
        int x;       // deklarasyon
        int y= 2000; // initialize ---asingment
        x = 30;      // guncelleme
        y = 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
