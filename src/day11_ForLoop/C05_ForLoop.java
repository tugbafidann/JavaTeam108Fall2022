package day11_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olarak pozitif bir sayi giriniz : ");
        int baslangicSayi= scan.nextInt();
        System.out.println("Lutfen bitis degeri olarak pozitif bir sayi giriniz  :");
        int bitisSayi=scan.nextInt();
        int toplam=0;
        if(bitisSayi<baslangicSayi){
            System.out.println("Baslangic degeri bitis degerinden buyuk olmali");
        }else {
            for (int i = baslangicSayi; i <=bitisSayi ; i++) {
                toplam +=i;
            }
            System.out.println(baslangicSayi+" ile "+bitisSayi+" arasindaki sayilarin toplami  :"+toplam);
        }



    }
}
