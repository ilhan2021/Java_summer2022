package projeler.Proje03_Banka;

public class C03_UserPanel {

   static String[][] data = new String[2][2];








    String kartNo = "";
    String sifreniz = "";

    public C03_UserPanel(String kartNo, String sifreniz) {
        this.kartNo = kartNo;
        this.sifreniz = sifreniz;
        data [0][0]="1234567890";
    }
    public static void method(){
        data [0][0] = "1234567890";
        data [0][1] = "1234";
        data [1][0] = "1234567899";
        data [1][1] = "1235";
    }
}
