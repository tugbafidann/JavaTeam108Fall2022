package day22_immutableClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C05_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);  // 2022-12-29

        System.out.println(tarih.getDayOfWeek()); //THURSDAY
        System.out.println(tarih.getMonthValue()); //12
        System.out.println(tarih.getMonth()); //DECEMBER
        System.out.println(tarih.getDayOfYear()); //363
        System.out.println(tarih.getChronology());// ISO

        System.out.println(tarih.withYear(2015)); // 2015-12-29
        System.out.println(tarih.withDayOfMonth(15)); //2022-12-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015));  //2015-12-15

        System.out.println(tarih.isLeapYear());  // false

        System.out.println(tarih.minusWeeks(5)); // 2022-11-24
        System.out.println(tarih.minusYears(3).minusMonths(5)
                           .minusDays(5));   // 2019-07-24

        System.out.println(tarih.plusWeeks(19)); // 2023-05-11
        System.out.println(tarih.plusYears(10).
                          plusMonths(3).plusDays(10)); // 2033-04-08

        LocalDate tarih1=LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);
        System.out.println(tarih1.isBefore(tarih2)
                              ? "Tarih1 daha eski"
                              :"Tarih2 daha eski"); //Tarih1 daha eski

        System.out.println(tarih1.isLeapYear()); // false
        System.out.println(tarih.hashCode()); //4141853
        System.out.println(tarih1.hashCode()); // 4045453
        System.out.println(tarih2.minusDays(7).hashCode()); // tarih 2 den 7 gun cikardi 4045453
    }
}
