package day03_DataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /*  ??????????????????
        Char data turunun ekstra bir ozelligi vardir:
          - eger matematiksel bir islemde char data turunden bir deger kullanirsak
        Java o charin ASCİİ degerini gozonunde bulundurarak matematiksel islemi gerceklestirir
         */
        System.out.println('a'+'b'); // 97 + 98 = 195
        System.out.println('a'-32);  // 97 - 32 = 65

        // 'a'-32 nin char olarak sonucunu yazdirin
        System.out.println((char) ('a'-32));  // A

        /*
        Kullanicidan bir char alip ASCİİ table dan kullanicinin girdigi char
        sonrasindaki 3 karakteri yazdirin
        ORNEK : input:a    output : b c d
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf=scan.next().charAt(0);
        System.out.println((char)(harf+1)+", "+(char)(harf+2)+", "+(char)(harf+3));






    }
}
