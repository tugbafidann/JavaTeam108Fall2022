package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        /*
        System.out.println(28/5);  // 5
        System.out.println(29/3);  // 9

        // Java bir bolme isleminde 2 int isleme giriyorsa sonucu int olarak verir

        int sayi1=25;
        int sayi2=6;
        System.out.println(sayi1/sayi2); // 4
        double dbl=6;
        System.out.println(sayi1/dbl);
        */


        // Kullanicidan 2 tam sayi alip 1. sayiyi 2. sayiya bolup
        // sonucu ondalikli olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz : ");
        int girilenSayi1= scan.nextInt();
        int girilenSayi2= scan.nextInt();
        System.out.println("İki sayinin bolme sonucu"+(double) girilenSayi1/girilenSayi2);
    }
}
