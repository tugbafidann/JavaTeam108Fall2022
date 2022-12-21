package day12_methodCreation;

import day11_ForLoop.C12_MethodOlusturma;

public class C01_Method {
    public static void main(String[] args) {
         /*
        Methodlar bazen cok basit islemleri bazen de kompleks islemleri yapabilirler
        biz o islemleri nasil yapabiliriz dey dousunmek yerine hazir methodu kullanmayi tercih ederiz
        bizde sonra kodu inceleyecek kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca anlar
        ayrica kodu her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz
         */

        String str="Java' da yolu yariladik";
        str.isEmpty(); // boolean sonuc dondu ama kullanmadik

        /*
         methodun dondurgu sonucu kullanmak istersek
         ya yazdiririz
         */
        System.out.println(str.isEmpty()); // false
         /*
         ya da donen sonucu ileride kullanacaksak atama yapabilirim

          */
        String buyukHafrliHali=str.toUpperCase();

        C12_MethodOlusturma.faktoryelyazdir(5); // day11 deki methodlari cagirdik

        // STATİC :Main method icinde kullandıgımız icin static olmasi gerekir. Staticler ancak
                 // static olanlar ile isleme girer
        sayiTopla(7,8);

    }
    public  static void  sayiTopla(int sayi1, int sayi2){
        System.out.println(" iki sayinin toplami " +(sayi1+sayi2)  );
    }
}
