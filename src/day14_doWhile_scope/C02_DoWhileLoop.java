package day14_doWhile_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0 a basarsa islemi bitirin

        int girilenSayi=4;   // 4 sayisinin hic bir önemi yoktur istedigimiz degeri girebiliriz
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Lutfen toplanmak icin tam sayi giriniz : ");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;
        }while (girilenSayi!=0);
        System.out.println("Sayilarin toplami : "+toplam);

      /*  While loop'da ilk sart saglanmazsa loop body hic CALISMAZ
        Do-While Loop'da once body calisdigi icin, sart yanlis olsa bile
        loop body'si en az 1 kere calismis olur
                */
    }
}
