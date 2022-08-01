package ocaSorular;

public class C05 {


static int i;
int j;

public static void main (String[] args) {
    C05 x1 = new x () ;
    C05 x2 = new x() ;
    x1.i = 3;
    x1.j = 4;
    x2.i = 5;
    x2.j = 6;


    System.out.println(
            x1.i + " " +
            x1.j + " " +
            x2.i + " " +
            x2.j);
}

/*
What is the result?
A-3456
83436
C.5456
D.3646
     */
}
