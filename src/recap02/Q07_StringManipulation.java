package recap02;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */
     public static void main(String[] args) {
         String  str1 = "$13.99";
         String str2 = "$10.55";
         str1 = str1.replaceAll("\\D","");//1399 olur.digital olmayanların yerine hiçlik kyunca böyle oldu
         str2 = str2.replaceAll("\\D","");//1055 olur.digital olmayanların yerine hiçlik kyunca böyle oldu
         System.out.println(str1+"\n"+str2);
         System.out.println(str1+str2);// string oldukları için toplamı 13991055 yazdiririr
         double sayi1 = Double.parseDouble(str1);// Stringleri sayiya cevirdik
         double sayi2 = Double.parseDouble(str2);// Stringleri sayiya cevirdik

         Double toplam = (sayi1+sayi2)/100;//sayilari toplayıp 100 e bölerek tekrar yukardaki verlen değerler dönüştürdük.
         System.out.println("$" + toplam);
     }
}
