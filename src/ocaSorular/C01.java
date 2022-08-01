package ocaSorular;

public class C01 {
    public static void main(String[] args) {
        /*
        Given:

        public class A {
            public static void main(String[] args) {
                String[] horses = new String[5];

                horses [4] = null;
                for (int i = 0; i < horses.length; i+.) {
                    if(i < args.length)
                        horses[] = args [];
                    System.out print(horses[i].toUpperCase()+" ");

                    And, if the code compiles the command line:
                    java A hope all is well
                    What is the result?

                    a) HOPE ALL IS WELL
                    b) HOPE ALL IS WELL null
                    c) An exception is thrown with no other output
                    d) HOPE ALL IS WELL, and then a Null PointerException
                    e) It prints: 'HOPE ALL IS WELL' and then a ArrayIndexOutOfBoundsException.
                    f) Compiler Error.
                    */

        String[] horses = new String[5];

        horses[4] = null;

        for (int i = 0; i < horses.length; i++) {
            if (i < args.length)
                horses[i] = args[i];
            System.out.println(horses[i].toUpperCase() + " ");


        }
    }
}
