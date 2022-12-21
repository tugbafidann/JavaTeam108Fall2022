package day03_DataCasting_MatematikselIslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        // % Modulus javada bolme islemi sonucunda kalan sonucu verir
        System.out.println(15%4); //3
        System.out.println(45%4); //1

        /*
        sayi cift mi                sayi%2
        saiy 7 nin kati mi          sayi%7
        sayinin birler basamagi     sayi%10
         */

        int girilenSayi=3426;
        int birlerBasamagi=girilenSayi%10; // 6
        System.out.println("3426 sayisinin Birler basamagi :  "+birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);  // 342

        birlerBasamagi=girilenSayi%10;    // 2
        System.out.println("3426 sayisinin Birler basamagi :  "+birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);   // 34

        birlerBasamagi=girilenSayi%10;     //3
        System.out.println("3426 sayisinin Birler basamagi :  "+birlerBasamagi);
        girilenSayi=girilenSayi/10;        //0
        System.out.println(girilenSayi);

        birlerBasamagi=girilenSayi%10;
        System.out.println("3426 sayisinin Birler basamagi :  "+birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi);
    }
}
