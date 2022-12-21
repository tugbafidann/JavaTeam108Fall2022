package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
         /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */

        Random rnd= new Random();
        int tutulanSayi= rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayac=0;
        while (!(tutulanSayi==sayi)){
            System.out.println("Lutfen tahmininizi giriniz : ");
            sayi= scan.nextInt();
            if(sayi<tutulanSayi){
                System.out.println("Tahmininizi buyultun");
            }else if (sayi>tutulanSayi) {
                System.out.println("Tahmininizi kucultun");
            }
            sayac++;
        }
        if(sayac<=3){
            System.out.println("Vaowww");
        } else if (4>sayac && sayac<=8) {
            System.out.println("Aferin");
        }else {
            System.out.println("Basarisiz");
        }


    }
}
