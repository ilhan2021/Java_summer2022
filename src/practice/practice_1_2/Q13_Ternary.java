package practice.practice_1_2;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable
     * . eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" ,
     *  20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        int fiyat = 10;
        if(fiyat<10){
            System.out.println("UCUZ");

        } else if (fiyat<20) {
            System.out.println("Normal");
        } else{
            System.out.println("Pahalı");
        }

        String sonuc = (fiyat<10)? "UCUZ":(fiyat<20)? "Normal": "Pahalı";
        System.out.println("sonuc = " + sonuc);
    }

}
