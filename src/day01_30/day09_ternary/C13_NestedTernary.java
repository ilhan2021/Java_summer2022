package day01_30.day09_ternary;

public class C13_NestedTernary {
    public static void main(String[] args) {
        int y = 5;
       y = (y > 5) ? (y < 10  ? 2 * y : 3 * y) : (y > 10 ? 2 + y : 3 + y);
        System.out.println("y = " + y);

    }
}
