package day13_methodOverloading_whileLoop;

import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        // ilk 15 fibonacci sayisini yazdirin

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);


        System.out.println("");
        // Asagıda verilen cumleyi tersine cevirin
        String str="Bir kere yaparim, yan gelir yatarim";
        String tersStr=C07_TerseCevirme.TersCevirme(str);  // Bize soruda sadece cevirin demis
                                                            // o yuzden burda yazdırmadik

        // Asagıda verilen cumlenin polindrome olup olmadigini yazdirin
        str="Java Candir";
        tersStr=C07_TerseCevirme.TersCevirme(str);
        if(str.equals(tersStr)){
            System.out.println("polindrome");
        }else {
            System.out.println("polindrome degil");
        }


        // asagıda verilen sayinin asal sayi olup almadığını yazdirin

        int sayi=21;
        System.out.println(C03_AsalSayi.asalSayiMi(sayi));
        // Burada bize true sonucu yazdirin ama kullanici true anlamadigi icin aşagıdaki islemi yapariz

        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi);
        if(sonuc){   // boolean tanimladigimiz icin true yada false olarak belirtmemize gerek yoktur
            System.out.println(sayi+" sayisi Asal Sayidir");
        }else {
            System.out.println(sayi+" sayisi Asal Sayi Degildir");
        }
    }
}
