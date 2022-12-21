package day13_methodOverloading_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {
        String str="Java cok guzel";

        System.out.println(str.substring(5));  // cok guzel
        System.out.println(str.substring(3,5));  // a
        // Eger sectigimiz isimde birden fazla method varsa buna overloading denir
        // ve ayni isimdeki method'lardan hangisinin calisacagina argument/parametre uyumu karar verir

        toplam(5,6);     //iki Tam sayinin toplami  :11
        toplam(8,7,1);   // Uc Tam sayinin toplami  :16
        toplam(5.6,2);   // Double ve int sayinin toplami  :7.6
        /*
           java ayni class icerisinde ayni isim
           ve ayni data turunden parametre sayisi ile 2 method olusturmaniza izin vermez
           1- ismini degistirebiliriz, ancak bu durumda overloading olmaz
              overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
           2- parametre sayisini degistirebiliriz
           3- ayni sayida parametre yazip, parametrelerin data turunu degistirebiliriz
              veya farkli data turundeki parametrelerin yerini degistirebiliriz
         */
    }

    public static void toplam(int sayi1, int sayi2){
        System.out.println("iki Tam sayinin toplami  :"+(sayi1+sayi2));
    }
    // 1
    public static void yeniToplam(int a, int b){
    }


    // 2
    public static void toplam(int sayi1, int sayi2,int sayi3){
        System.out.println("Uc Tam sayinin toplami  :"+(sayi1+sayi2+sayi3));
    }


    // 3
    public static void toplam(double sayi1, int sayi2){
        System.out.println("Double ve int sayinin toplami  :"+(sayi1+sayi2));
    }
    public static void toplam(int sayi2, double sayi1){
        System.out.println("Int ve double sayinin toplami  :"+(sayi1+sayi2));
    }
    public static void toplam(double sayi1,double sayi2){
        System.out.println("Double 2 sayinin toplami : ");
    }

}
