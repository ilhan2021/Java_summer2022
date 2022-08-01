package projeler.Proje03_Banka;

import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kartNo ="";
        while (true){
            System.out.println("Kart Numarasi Giriniz :");
           kartNo= scan.nextLine();
            kartNo = kartNo.replace(" ","");
            if(kartNo.length() == 10 && kartNo.equals(kartNo.replaceAll("\\D",""))){
                break;

            }
            System.out.println("kart numaranizi yeniden giriniz");
        }
        String sifreniz="";


        while (true){
            System.out.println("Sifrenizi Giriniz :");
            sifreniz = scan.next();
            sifreniz = sifreniz.replace(" ","");
            if(sifreniz.length() == 4 && sifreniz.equals(sifreniz.replaceAll("\\D",""))){
                break;

            }
            System.out.println("siffreyi yeniden giriniz");


        }
        C03_UserPanel kisiselBilgiler = new C03_UserPanel(kartNo,sifreniz);

        C03_UserPanel.method();

    }
}
