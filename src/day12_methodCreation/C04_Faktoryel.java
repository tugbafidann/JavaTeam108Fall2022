package day12_methodCreation;

import java.util.Scanner;

public class C04_Faktoryel {
    public static void main(String[] args) {
        // verilen bir sayinnin 15 den kucuk bir poçitif tamsayi oldugun kontrol eden
        // kucukse bir method olusturup faktoryel degerini yazdirin
        // sayi istenen aralikda degilse uyari yazdirin

        int input=12;
        if (input>0 && input<15){
            faktoryelYazdir(input);
        }else {
            System.out.println("15 den kucuk bir sayi giriniz");
        }



    }
    public static void faktoryelYazdir(int sayi){
        int carpim=1;
        for (int i = sayi; i >=1 ; i--) {
            carpim=carpim*i;
        }
        System.out.println(sayi+" sayisinin fatoryeli : "+carpim);
    }
}
