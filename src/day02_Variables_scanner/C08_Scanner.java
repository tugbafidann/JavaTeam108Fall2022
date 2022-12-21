package day02_Variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // SORU -4 Kullanicidan bir dikdortgenin 2 kenar uzunluğunu alip alanini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdörtgenin iki kenar uzunlugunu giriniz : ");
        double girilenKenar1= scan.nextDouble();
        double girilenKenar2= scan.nextDouble();
        System.out.println("Dikdörtgenin Alani : "+(girilenKenar1*girilenKenar2));
    }
}
