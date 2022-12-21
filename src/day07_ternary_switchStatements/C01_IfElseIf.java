package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi alin
                // sayi rakam ise "girilen sayi rakam"
                // sariy 2 basamakli ise "girilen sayi iki basamakli"
                // sayi 2 basamaktan buyuk ise "buyuk sayi " yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int girilenSayi= scan.nextInt();

        if(0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi iki basamakli ");
        else if (girilenSayi>=100) System.out.println("buyuk sayi");
       /*
        eğer if else cumleleri ELSE ile bitmiyorsa tum durumları kapsamaz
        yani bazi degerler icin hic bir if bodysi calismayabilir

        Bu tur sorulari cozerken sartlarin tamamini dikkatli yazmak gerekir
        ORNEK: 10<=girilenSayi kismini silersek -896 da girsek sonucu 2 basamaklidir olarak verir
        cunku ilk if blogu saglanmayip asag gecildi sonra sayinin 99 dan kucuk olup olmadigi karsilastirildi
        ve sonuc - olarak 99 dan kucuk oldugu icin 2 basamakli sartini kabul etti
        */
    }
}
