package day23_dataTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman); //01:20:07.471854600

        System.out.println(zaman.getMinute()); //21

        System.out.println(zaman.withSecond(0).withNano(0)); //01:21
        System.out.println(zaman.withSecond(1).withNano(1));  //01:22:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250));
        // 100 saat ve 250 dakika sonraki zaman  //09:33:29.677231800
        /*
        bir for loop ile 1'den 10000'e kadar olan sayilari yanyana yazdirin
        bu islem icin gecen zamani bulun
         */
        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic :"+basZamani);  // baslangic :01:30:28.499691800
        for (int i = 1; i <10000 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        LocalTime bitisZamani=LocalTime.now();
        System.out.println("bitis"+bitisZamani);   // bitis01:30:29.168701600

        System.out.println("Islem süreci : "+
                (bitisZamani.getNano()-basZamani.getNano())
                 +" nano saniye");  // Islem süreci : -330990200 nano saniye
          /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir
            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */
    }
}
