package day01_30.day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek cok guzel";
        // Verilen String te herhangi bir String ve char ın
        // ilk kullanıldıgı index'i bize döndurur
     // System.out.println(str.indexOf('g'));//6
     // System.out.println(str.indexOf("r"));//7
     // System.out.println(str.indexOf("j"));//-1
     // System.out.println(str.indexOf("mek"));//10

        //eger istediğmiz indexten sonrasını kontrol etmek istersek
        // o zaman aynı methodu iki parametreli olarak yazarız

       // System.out.println(str.indexOf("g",(6+1)));// verilen indexten başlar

        // yukarıdakı str lerde 2. ve 3. e nin indexlerini bulunuz
        // 2. e yi bulabilmek için ilk e nin index ini bulmam lazım

        int ilke = str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1);

        // 2. e varsa 3. e yi nasıl bulurum
        if(ikincie==-1){
            System.out.println("Verilen str da e yoktur");
        }else{
            int ucuncue = str.indexOf("e",ikincie+1);
            if(ucuncue==-1){
                System.out.println("Verilen str da e yoktur");
            }else {
                System.out.println("verilen str de ucuncue nin index i = " + ucuncue);
            }

        }

    }
}
