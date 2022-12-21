package day23_dataTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);  // 2022-12-20T12:31:13.676647600
        ldt=LocalDateTime.now();
        System.out.println(ldt);   // 2022-12-20T12:31:56.674803100

        System.out.println(ldt.getDayOfWeek()); // TUESDAY

        System.out.println(ldt.withYear(2030)); // 2030-12-20T12:33:28.588758100 --2030yili olarak verdi

    }
}
