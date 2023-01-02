package day23_dataTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1991,11,23);
        LocalDate bugun=LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas);  //P31Y1M11D
        System.out.println(yas.getYears()); // 31

        LocalDate baslangic=LocalDate.of(2010,8,5);
        LocalDate bitis=LocalDate.of(2015,7,20);
        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure);  //P4Y11M15D

    }
}
