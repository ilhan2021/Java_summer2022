package day01_48.day22_multiDimensionalArrays;

public class C05_MdaSonElemanlariToplama {
    /*
    Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki
    son elemanlarin carpimini  ekrana yazdiran bir
     program yaziniz { {1,2,3}, {4,5}, {6} }

     */
    public static void main(String[] args) {
        int[][] arr={ {1,2,3}, {4,5,2}, {6,3} };
        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(j==arr[i].length-1){
                    carpim *= arr[i][j];
                }

            }

        }
        System.out.println("son elemanlarin carpimi :"+carpim);
    }
}
