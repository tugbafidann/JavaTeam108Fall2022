package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        /* ArrayList esnek uzunluktaki bir ararydir
         Ancak ArrayList, array altyapisini kullandigi icin
         elemanları tek tek eklememiz gerkir
         */

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler); //[A, B, K]

        // B ile K arasina D ekleyelim
        harfler.add(3,"D");
        System.out.println(harfler); // [A, C, B, D, K] // direk yazdirabiliriz
        List<String> karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");
        harfler.addAll(karakterler);
        System.out.println(harfler); //[A, C, B, D, K, *, #]
        harfler.addAll(2,karakterler);
        System.out.println(harfler); //[A, C, *, #, B, D, K, *, #]




    }
}
