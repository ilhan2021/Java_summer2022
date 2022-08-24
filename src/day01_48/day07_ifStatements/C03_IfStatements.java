package day01_48.day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        bir if statements'te  { kullanılmazsa
        java ilk satırı sart ile bağlar, sonrakiler bağımsız olur.

        eğer  birden fazla satır ayni if sartina bağlanırsa { kullanmaliyiz.
         */
        int sayi = -23;
        if (sayi>0)
            System.out.println("sayi pozitif");         // { kullanmadığımız için değere bağlı çalışır
            System.out.println("pozitif kalacaktir");   //{ kullanmadığımız için her zaman çalışır
            System.out.println("ucuncu satir");         //{ kullanmadığımız için her zaman çalışır

        if (sayi%2==0)
            System.out.println("sayi çift");            //{ kullanmadığımız için değere bağlı çalışır
            System.out.println("çift kalacaktir");      //{ kullanmadığımız için her zaman çalışır

        if (sayi%5==0)
            System.out.println("sayi 5'in tam kati");    //{ kullanmadığımız için değere bağlı çalışır

    }
}
