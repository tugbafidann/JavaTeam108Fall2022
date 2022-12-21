package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicidan 4 basamakli sayi alip rakamlar toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz : ");
        int girilenSayi= scan.nextInt(); //2457
        int rakamlarToplami=0;
        int birlerBasamagi=0;
        birlerBasamagi=girilenSayi%10;  // 7
        rakamlarToplami=rakamlarToplami+birlerBasamagi;      // 0+7=7
        girilenSayi=girilenSayi/10;                         // 2457/10=245

        birlerBasamagi=girilenSayi%10;  // 5
        rakamlarToplami=rakamlarToplami+birlerBasamagi;      // 7+5=12
        girilenSayi=girilenSayi/10;                         // 245/10=24

        birlerBasamagi=girilenSayi%10;  // 4
        rakamlarToplami=rakamlarToplami+birlerBasamagi;      // 12+4=16
        girilenSayi=girilenSayi/10;                         // 24/10=2

        rakamlarToplami=rakamlarToplami+girilenSayi;        // 16+2=18
        System.out.println("Girilen sayinin rakamlar toplami : "+rakamlarToplami);



    }
}
