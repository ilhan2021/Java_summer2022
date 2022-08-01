package day31_48.day35_inheritancedeConstructorKullanma;

public class kDizelCorolla extends HCorolla {
   kDizelCorolla(){

        System.out.println("KDizelCorolla Parametresiz const.");
    }

    kDizelCorolla(String isim){
       super(isim);

        System.out.println("KDizelCorolla parametreli  const.");
    }

    public static void main(String[] args) {

      // kDizelCorolla obj1 = new kDizelCorolla();
        kDizelCorolla obj2 = new kDizelCorolla("isim");
    }
}
