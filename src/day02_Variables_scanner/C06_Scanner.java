package day02_Variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir sayi isteyin ve karesini alin

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen karesini almak istediginiz sayiyi girin : ");
        double girilenSayi= scan.nextDouble();
        System.out.println("Girilen sayinin karesi : "+girilenSayi*girilenSayi);
    }
}
