package day10_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degerlerini alip
        // Bu sinirlar dahil olarak, bu sayilar arasinda 5 in kati olanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz : ");
        int basSayi= scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz  :");
        int sonSayi=scan.nextInt();
        for (int i =basSayi; i <=sonSayi ; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }

        }
    }
}
