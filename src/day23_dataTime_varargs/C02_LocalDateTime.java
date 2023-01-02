package day23_dataTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);  // 2023-01-03T01:34:58.374406600
        ldt=LocalDateTime.now();
        System.out.println(ldt);   // 2023-01-03T01:34:58.377405800

        System.out.println(ldt.getDayOfWeek()); // TUESDAY

        System.out.println(ldt.withYear(2030)); // 2030-01-03T01:34:58.377405800 --2030yili olarak verdi


    }
}
