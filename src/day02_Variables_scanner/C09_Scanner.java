package day02_Variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        // Soru 7: Kullanicidan 2 deger alip degerlerini degistiren programi yaziniz(swap)
        /*
        sayi1=10    sayi2=20 ise degistirip

        sayi2=20  sayi1=10
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. degeri giriniz : ");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen 2. degeri giriniz : ");
        int sayi2= scan.nextInt();
        System.out.println("Eski degerler : sayi1 ="+sayi1+"  sayi2="+sayi2);
        int bosKova=0;
        bosKova=sayi1; // boskova=10
        sayi1=sayi2;   // sayi1=20;
        sayi2=bosKova;  // sayi2=10
        System.out.println("Yeni degerler : sayi1 ="+sayi1+"  sayi2="+sayi2);







    }
}
