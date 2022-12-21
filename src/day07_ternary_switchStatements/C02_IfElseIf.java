package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi alin
              //  sayi negatif ise "negatif sayi",
              //   sayi rakam ise "girilen sayi rakam"
              //   sariy 2 basamakli ise "girilen sayi iki basamakli"
              //   sayi 2 basamaktan buyuk ise "buyuk sayi " yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int girilenSayi= scan.nextInt();

        if(girilenSayi<0) System.out.println("Negatif sayi");
        else if (girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if(girilenSayi<=99) System.out.println("grilen sayi iki basamakli");
        else System.out.println("Buyuk sayi");


    }
}
