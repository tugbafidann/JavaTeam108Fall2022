package day02_Variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini alin ve giriline ismi buyuk hafrlerle yazdirin

            // kullanicidan deger almak icin 3 islem yapmak gerekir

           //1.adim SCANNER objesi olusturmak
        Scanner scan=new Scanner(System.in);

           //2. adim kullaniciya ne istedigimizi soylemek
        System.out.println("İsminizi yaziniz : ");

           //3. adim kulllanicinin gireceği degeri kaydedecegimiz bir variable olusturalim.
         //scan objesi ile ilgili methodu kullanarak kullanicidan girdiği
         // degeri olusturdugumuz variable atayin
        String girlenIsim= scan.nextLine();

          // artik kullanicidin girdigi değer girlen isim varible kayitli

        System.out.println(girlenIsim.toUpperCase());
    }
}
