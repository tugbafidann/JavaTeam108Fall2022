package day03_DataCasting_MatematikselIslemler;

public class C01_DataCasting {
    public static void main(String[] args) {
        /*String str=23;
        int sayi="Merhaba";
        char ilkHarf=true;

        Kesinlikle faklı data turlerindeki degerleri atama yapamayiz
         */
        short sayi2=45;
        int sayi3=sayi2;
        // int =   short   degerin kapasitesi variableden kucuk oldugu için sorun yok

        int sayi4=45;
        double sayi5 = sayi4;
        //     doubl e= int     degerin kapasitesi variableden kucuk oldugu icin sorun yok
                                 //   AUTO WİDHİNG

        double sayi6=5;
        //int sayi7 = sayi6;
        //    int   = double   double int degerinden kucuk oldugu için java otomatik
             //                cevirme yapamaz hata  verir

        int sayi8=99;
        //  byte sayi9=sayi8;    byte< int oldugu icin otomatik cevirme yapmaz hata verir




    }
}
