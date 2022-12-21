package day02_Variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        /*
    Soru -2 : Kullanicidan bir double bir init sayi alip
    toplamini ve caripmi

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir deger giriniz : ");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lutfen tamsayi giriniz : ");
        int sayiInt= scan.nextInt();
        System.out.println("Sayilarin toplami : "+(sayiDbl+sayiInt));
        System.out.println("Sayilarin carpimi : "+(sayiDbl*sayiInt));
    }


}
