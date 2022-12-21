package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // Kullanicidan bir double bir tam sayi alin
        // Double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucunun tamsayi kismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz : ");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int sayiInt= scan.nextInt();

        System.out.println((int)sayiDbl/sayiInt);
    }
}
