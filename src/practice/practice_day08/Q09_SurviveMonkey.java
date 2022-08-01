package practice.practice_day08;

public class Q09_SurviveMonkey {
         /*
    getSum isminde bir method oluşturun.
    Parametresi ArrayList'tir.
    Dizideki tüm $ ları kaldır ve tüm sayıları topla
    return yaptğımız veri tipi 'int' olmalıdır.
    sonuç 0'dan küçükse, -1 yazdırın.
    Örnek1:
    ArrayList = $13, $15, $20
    Cevap = 48 olmalı
    Örnek 2 :
    ArrayList= $-13, $0, $0
    Cevap = -1 olmalı.
     */
         public static void main(String[] args) {
             int numberOfBanana = 165, survivalDays = 1;
             boolean monkeyAlive = true;
             do {
                 System.out.println("maymunlar gunde 4 muz yer");
                 numberOfBanana -= 4;//toplam muzdan 4 azalır
                 survivalDays++; // yasadigi gun sayisini artir
                 if(numberOfBanana<4){// 4'ten az muz kalırsa
                     monkeyAlive = false;//maymun hayatta degil
                     System.out.println("bugun "+survivalDays+" .gun muz kalmadi maymun pert..:( ");
                 }else
                     System.out.println("bugun "+survivalDays+" .gun maymun hayatta..:)");


             }while (monkeyAlive);
             System.out.println("toplam yasadigi gun sayisi :"+(survivalDays-1));
         }
}
