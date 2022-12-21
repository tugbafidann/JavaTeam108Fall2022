package day12_methodCreation;

import java.util.Scanner;

public class C_Deneme {
    public static void main(String[] args) {
        // Kullanıcının girdigi sayiların toplamı 500 ve daha buyuk olunca durdur

        Scanner scan=new Scanner(System.in);


        int toplam=0;
        int sayi=0;
        for (int i = 0; i <100; i++) {
            System.out.println("Lutfen bir sayi giriniz : ");
            sayi= scan.nextInt();
            toplam +=sayi;
            if(toplam>=500){
                System.out.println("Sayiların toplami : "+toplam+" oldu");
                break;
            }

        }





        while (toplam<=500){
            System.out.println("Lutfen bir sayi giriniz : ");
            sayi= scan.nextInt();
            toplam +=sayi;
        }
        System.out.println("Sayiların toplami : "+toplam+" oldu");


    }


}
