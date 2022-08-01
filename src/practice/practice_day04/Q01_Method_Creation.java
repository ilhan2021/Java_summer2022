package practice.practice_day04;

public class Q01_Method_Creation {
    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        birKereYazdir("aabbccdddeeeaassgghhrddaaaa");
    }

    private static void birKereYazdir(String str) {
        String output = "";// String Default değeri "" olduğu için işleme etki etmesin diye bu şekilde atama yaptık
        for (int i = 0; i < str.length(); i++) {
            if(!output.contains(str.substring(i,i+1))){ // Tekrarsız karekterleri döndüreceğimiz için sonucumuz
                                                        // str den aldığımız herhangi bir karakteri içermesin
                output +=str.substring(i,i+1);// o zaman sonuca eklesin.
            }
        }
        System.out.println(output);
    }
}