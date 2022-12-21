package day03_DataCasting_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";

        /* int primitive oldugundan hazir method'lari yoktur
           string ise non-primitive oldugu icin hazir method'lara sahiptir
           int, char, boolean gibi primitive data turlerinde hazir method kullanmak icin
           Java Integer, Character, Boolean gibi wrapper class'lar olusturmustur
           bunlar primitive'ler ile ayni degerleri alabilir
           ama ekstradan method'lari da vardir
         */

        Integer sayi2=20;
        /*
           islemlerimizi yaparken bazen String olarak tanimlanmis
           ancak matematiksel icerik barindiran variable'lar ile karsilasabiliriz
           Bu durumda bu tur String variable'lari sayiya cevirmek ihtiyacimiz olabilir

           Eger sayiya cevirmek istedigimiz metin'lerde harf veya sayi olmayan
           baska karakter varsa Java hata verir
         */
        String str2="123";
        String str3="354";
        System.out.println(str2+str3); // 123354

        int str2Int= Integer.parseInt(str2); // 123
        int str3Int= Integer.parseInt(str3); // 354

        System.out.println(str2Int+str3Int); // 477

        System.out.println(Integer.MAX_VALUE);  // 2147483647
        System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Short.MAX_VALUE);  // 32767

        char krk='$';
        System.out.println(Character.isDigit(krk)); //      sayi mi         -- false
        System.out.println(Character.isLetter(krk));  //    harfmi          -- false
        System.out.println(Character.isAlphabetic(krk)); // Alfabetik mi   -- false

        short sayi3=4;
        int sayi4=sayi3;

        // Wrapper classlarda casting olmaz

        Short sayi5=45;
        //Integer sayi6=(Integer) sayi5;


    }
}
