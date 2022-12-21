package day08_stringManipulation;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java ogren isi kap";
        System.out.println(str.length());  // karakter sayisi 18

        // Metnini tam ortasindaki karakter nedir?
        System.out.println(str.charAt(str.length()/2));  // n

        // son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));  // p

        // bir karakteri degil de verilen stringin icerdigi bir metin parcasini elde etmek
        // ornegin "ogren" kelimesinini alalim
        System.out.println(str.substring(5,9));  // ogre
        /* 
        substring(bas, bitis) methodunda
        baslangic olarak yazilan index dahil(inclusive)
        bitis olarak yazilan index haric(exclusive) dir
         */
        System.out.println(str.substring(5,10));  // ogren


        // str dan java kelimesini yazdiralim
        System.out.println(str.substring(0,4));  // java

        // kap yazdirin
        System.out.println(str.substring(15,18)); // kap
        System.out.println(str.substring(15)); // kap
        System.out.println(str.substring(str.length()-3)); // kap

        // substring kullanarak sadece j harfini yazdirin
        System.out.println(str.substring(0,1));

        // substring kullanarak 9. index deki harfi buyuk olarak yazdirin
        System.out.println(str.substring(9,10).toUpperCase()); // N
        System.out.println(str.charAt(9));

        // chartAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz
        System.out.println(str.substring(5,5)); // hiclik yazdirir yani konsolda bos bir satir olusur
        System.out.println("=======");
        // System.out.println(str.substring(4,3)); // StringIndexOutOfBoundsException

        // System.out.println(str.substring(25,28)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length())); // hiclik yazdirir
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException
        System.out.println("=======");





    }
}
