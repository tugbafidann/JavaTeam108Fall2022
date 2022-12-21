package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //  Kullanicidan toplamak uzere sayi alin
        //  girilen sayilarin toplami 500 olur veya gecerse
        //  " Bu kadar sayi yeter" deyip toplami yazdirin


        // bu soruyu illa da for loop ile yapalim dersek
        // adim sayisini tahmin edip biraz abartabiliriz


        Scanner scan= new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        for (int i = 1; i <10000 ; i++) {

            System.out.println("toplamak uzere tamsayi giriniz");
            sayi= scan.nextInt();

            toplam += sayi;

            if(toplam>=500){
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu");
                break;
            }
        }

        // Aynı soruyu while loop ile yapalim
        System.out.println("***** WHİLE LOOP ile *****");
         toplam=0;
        sayi=0;
        while (toplam<500){
            System.out.println("Lutfen toplamak icin sayi giriniz : ");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Bu kadar yeter. !!  Sayilarin topalami  :"+toplam);
    }
}
