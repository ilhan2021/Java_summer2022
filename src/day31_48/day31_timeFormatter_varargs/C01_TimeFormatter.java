package day31_48.day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat);         // tarihSaat = 2022-07-25T21:41:38.363401900

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat));             // 25/7/22 09:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));             // 25/Tem/2022 21:47

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm a");
        System.out.println(dtf3.format(tarihSaat));             // 25/Tem/2022 21:47


    }
}
