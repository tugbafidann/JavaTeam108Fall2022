package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
       List<String> harfler=new ArrayList<>();
       harfler.add("A");
       harfler.add("Z");
       harfler.add("T");
        System.out.println(harfler.remove("Z"));// true  Zyi siler bize true degeri doner
        System.out.println(harfler); // [A, T]

        System.out.println(harfler.remove(0)); // A
        // 0. indexdeki elementi siler ve gorevi tamamlayip silinen elementi bize dondurur
        System.out.println(harfler); // [T]


        List<String> yeniList=new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");


        System.out.println(yeniList.removeAll(harfler)); // true ortak Toldugu icin Tyi sildi sadece
        /*
        yenilistten tum harfler listesindeki harfleri remove et
        harfler listesindeki tüm elementleri yeniListten siler
        görevi tamamlarsa true, yoksa false doner
         */
        System.out.println(yeniList); // [C, D]
        System.out.println(harfler); // [T]

    }
}
