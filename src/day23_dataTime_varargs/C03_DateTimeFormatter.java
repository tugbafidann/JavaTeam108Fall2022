package day23_dataTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {
        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         m:minute

         a yazarsak AM veya PM degerini yazar




         */
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);  // 2023-01-03T01:39:05.649942600

        // Sadece tarihi 03/01/2023 olarak yazdiralim
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1));  // 03/01/2023

        // Sadece tarihi 01.03.23 Tue seklinde yazdirin
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2)); // 01.03.23 Sal

        // Sadece zamani 01:39  am olarak yazdırın
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format3));   // 01:39 ÖÖ
    }
}
